# Spring MCP Server

A generic, lightweight template for building Model Context Protocol (MCP) servers using Spring Boot and Spring AI.

## Overview
This server is built with Spring Boot WebFlux and the `spring-ai-starter-mcp-server-webflux` starter. It demonstrates how to expose a local tool (e.g., `CalculatorTool`) to any MCP-compatible AI Assistant over an SSE connection.

## Development

- **Java Version:** 21
- **Framework:** Spring Boot 3.x with Spring AI

Run locally using Maven:
```bash
mvn spring-boot:run
```

Or run via Docker Compose from the root directory.
