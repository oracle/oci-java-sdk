/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.module;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;

/** MCP Schema definitions for Model Context Protocol */
public class McpSchema {

    /** Initialize request for MCP handshake */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class InitializeRequest {
        @JsonProperty("protocolVersion")
        public String protocolVersion;

        @JsonProperty("clientInfo")
        public ClientInfo clientInfo;

        @JsonProperty("capabilities")
        public ClientCapabilities capabilities;

        public InitializeRequest() {}

        public InitializeRequest(
                String protocolVersion, ClientInfo clientInfo, ClientCapabilities capabilities) {
            this.protocolVersion = protocolVersion;
            this.clientInfo = clientInfo;
            this.capabilities = capabilities;
        }
    }

    /** Initialize result from MCP server */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class InitializeResult {
        @JsonProperty("protocolVersion")
        public String protocolVersion;

        @JsonProperty("serverInfo")
        public ServerInfo serverInfo;

        @JsonProperty("capabilities")
        public ServerCapabilities capabilities;

        public InitializeResult() {}
    }

    /** Client information */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ClientInfo {
        @JsonProperty("name")
        public String name;

        @JsonProperty("version")
        public String version;

        public ClientInfo() {}

        public ClientInfo(String name, String version) {
            this.name = name;
            this.version = version;
        }
    }

    /** Server information */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ServerInfo {
        @JsonProperty("name")
        public String name;

        @JsonProperty("version")
        public String version;

        public ServerInfo() {}
    }

    /** Client capabilities */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ClientCapabilities {
        @JsonProperty("roots")
        public RootsCapability roots;

        @JsonProperty("sampling")
        public SamplingCapability sampling;

        public ClientCapabilities() {}
    }

    /** Server capabilities */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ServerCapabilities {
        @JsonProperty("tools")
        public ToolsCapability tools;

        @JsonProperty("resources")
        public ResourcesCapability resources;

        @JsonProperty("prompts")
        public PromptsCapability prompts;

        public ServerCapabilities() {}
    }

    /** Roots capability */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class RootsCapability {
        @JsonProperty("listChanged")
        public Boolean listChanged;

        public RootsCapability() {}
    }

    /** Sampling capability */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SamplingCapability {
        public SamplingCapability() {}
    }

    /** Tools capability */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolsCapability {
        @JsonProperty("listChanged")
        public Boolean listChanged;

        public ToolsCapability() {}
    }

    /** Resources capability */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ResourcesCapability {
        @JsonProperty("subscribe")
        public Boolean subscribe;

        @JsonProperty("listChanged")
        public Boolean listChanged;

        public ResourcesCapability() {}
    }

    /** Prompts capability */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class PromptsCapability {
        @JsonProperty("listChanged")
        public Boolean listChanged;

        public PromptsCapability() {}
    }

    /** Tool definition */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Tool {
        @JsonProperty("name")
        public String name;

        @JsonProperty("description")
        public String description;

        @JsonProperty("inputSchema")
        public JsonNode inputSchema;

        public Tool() {}

        public Tool(String name, String description, JsonNode inputSchema) {
            this.name = name;
            this.description = description;
            this.inputSchema = inputSchema;
        }

        public String name() {
            return name;
        }

        public String description() {
            return description;
        }

        public JsonNode inputSchema() {
            return inputSchema;
        }
    }

    /** List tools result */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ListToolsResult {
        @JsonProperty("tools")
        public List<Tool> tools;

        public ListToolsResult() {}

        public ListToolsResult(List<Tool> tools) {
            this.tools = tools;
        }

        public List<Tool> tools() {
            return tools;
        }
    }

    /** Call tool request */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CallToolRequest {
        @JsonProperty("name")
        public String name;

        @JsonProperty("arguments")
        public Map<String, Object> arguments;

        public CallToolRequest() {}

        public CallToolRequest(String name, Map<String, Object> arguments) {
            this.name = name;
            this.arguments = arguments;
        }

        public String name() {
            return name;
        }

        public Map<String, Object> arguments() {
            return arguments;
        }
    }

    /** Call tool result */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CallToolResult {
        @JsonProperty("content")
        public List<Content> content;

        @JsonProperty("isError")
        public Boolean isError;

        public CallToolResult() {}

        public CallToolResult(List<Content> content, Boolean isError) {
            this.content = content;
            this.isError = isError;
        }

        public List<Content> content() {
            return content;
        }

        public Boolean isError() {
            return isError;
        }
    }

    /** Content item */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Content {
        @JsonProperty("type")
        public String type;

        @JsonProperty("text")
        public String text;

        public Content() {}

        public Content(String type, String text) {
            this.type = type;
            this.text = text;
        }

        public static Content text(String text) {
            return new Content("text", text);
        }
    }

    /** JSON-RPC request wrapper */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class JsonRpcRequest {
        @JsonProperty("jsonrpc")
        public String jsonrpc = "2.0";

        @JsonProperty("id")
        public Integer id;

        @JsonProperty("method")
        public String method;

        @JsonProperty("params")
        public Object params;

        public JsonRpcRequest() {}

        public JsonRpcRequest(Integer id, String method, Object params) {
            this.id = id;
            this.method = method;
            this.params = params;
        }
    }

    /** JSON-RPC response wrapper */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class JsonRpcResponse {
        @JsonProperty("jsonrpc")
        public String jsonrpc = "2.0";

        @JsonProperty("id")
        public Integer id;

        @JsonProperty("result")
        public Object result;

        @JsonProperty("error")
        public JsonRpcError error;

        public JsonRpcResponse() {}
    }

    /** JSON-RPC error */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class JsonRpcError {
        @JsonProperty("code")
        public Integer code;

        @JsonProperty("message")
        public String message;

        @JsonProperty("data")
        public Object data;

        public JsonRpcError() {}

        public JsonRpcError(Integer code, String message, Object data) {
            this.code = code;
            this.message = message;
            this.data = data;
        }
    }

    /** JSON-RPC notification (no id field) */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class JsonRpcNotification {
        @JsonProperty("jsonrpc")
        public String jsonrpc = "2.0";

        @JsonProperty("method")
        public String method;

        @JsonProperty("params")
        public Object params;

        public JsonRpcNotification() {}

        public JsonRpcNotification(String method, Object params) {
            this.method = method;
            this.params = params;
        }
    }
}
