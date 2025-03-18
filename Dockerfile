FROM ghcr.io/codesandbox/devcontainers/universal:latest

# Add and setup initial files
ADD . .
RUN chmod +x ./setup.sh
