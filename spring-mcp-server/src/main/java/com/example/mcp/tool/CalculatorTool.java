package com.example.mcp.tool;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTool {

    @McpTool(name = "add", description = "Adds two numbers together.")
    public double add(
            @ToolParam(description = "The first number.") double a,
            @ToolParam(description = "The second number.") double b) {
        return a + b;
    }

    @McpTool(name = "subtract", description = "Subtracts the second number from the first.")
    public double subtract(
            @ToolParam(description = "The first number.") double a,
            @ToolParam(description = "The second number.") double b) {
        return a - b;
    }

    @McpTool(name = "multiply", description = "Multiplies two numbers together.")
    public double multiply(
            @ToolParam(description = "The first number.") double a,
            @ToolParam(description = "The second number.") double b) {
        return a * b;
    }

    @McpTool(name = "divide", description = "Divides the first number by the second.")
    public double divide(
            @ToolParam(description = "The first number.") double a,
            @ToolParam(description = "The second number.") double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
