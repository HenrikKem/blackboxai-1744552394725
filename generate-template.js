const { CodeSandbox, VMTier } = require("@codesandbox/sdk");

(async () => {
  // Create the client with your token
  const sdk = new CodeSandbox(
    process.env.CSB_API_KEY || "csb_v1_sFWkJNO1cCbN0w-qZCruHqZakxyOhTYYdgdLGBLXdLg"
  );
  const sandbox = await sdk.sandbox.create({ template: "rnl75z" });

  console.log("Writing dockerfile for template", sandbox.id);


  const shell = sandbox.shells.run(
    "docker build -t vscode-server -f ContainerDockerfile ."
  );
  
  shell.onOutput((output) => {
      console.log(output);
  });

  const result = await shell;
  console.log(`Shell result: ${result.output}`);
  
  console.log("Rebooting sandbox for template");
  await sandbox.reboot();

  console.log("Template ID generated:", sandbox.id);
})();