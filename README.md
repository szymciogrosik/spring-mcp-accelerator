# Spring MCP Accelerator

This repository serves as a centralized hub and template for creating and running advanced **Model Context Protocol (MCP)** servers locally via Docker Compose using Spring AI.

## Included Servers
1. **[Spring MCP Server](./spring-mcp-server/README.md)** - A generic template for a Spring Boot based MCP server, featuring a sample `CalculatorTool`.

---

## How to Run

This environment uses Docker Compose to launch the MCP servers.

1. Review the configuration and add your tools to `spring-mcp-server`.
2. Start the hub:
   ```bash
   docker-compose up --build
   ```
3. The services will spin up and expose their SSE endpoints on the ports defined in the compose file.

---

## Integration with AI Assistants

To connect the MCP servers to your AI Assistant, you must configure SSE (Server-Sent Events) connections in your IDE's MCP settings file.

```json
{
  "mcp": {
    "spring-mcp-server": {
      "type": "remote",
      "url": "http://localhost:8395/sse",
      "enabled": true
    }
  }
}
```
