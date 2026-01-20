/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools.prebuilt;

import java.util.List;
import java.util.Objects;

public class AgenticRagTool {
    private List<String> knowledgeBaseIds;
    private String instruction;
    private String name;
    private String description;

    public AgenticRagTool() {}

    // All-args constructor (used by Builder)
    private AgenticRagTool(List<String> knowledgeBaseIds, String instruction) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        this.instruction = instruction;
    }

    // Getters
    public List<String> getKnowledgeBaseIds() {
        return knowledgeBaseIds;
    }

    public String getInstruction() {
        return instruction;
    }

    /**
     * Returns the name of the tool.
     *
     * @return the name of the tool
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the description of the tool.
     *
     * @return the description of the tool
     */
    public String getDescription() {
        return description;
    }

    // Setters
    public void setKnowledgeBaseIds(List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds =
                Objects.requireNonNull(knowledgeBaseIds, "knowledgeBaseIds must not be null");
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Sets the name of the tool.
     *
     * @param name the name of the tool
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the description of the tool.
     *
     * @param description the description of the tool
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Builder class for creating an instance of AgenticRagTool.
     *
     * <p>This builder ensures that the required knowledge base IDs are provided.
     */
    public static class Builder {
        private List<String> knowledgeBaseIds;
        private String instruction;

        public Builder knowledgeBaseIds(List<String> knowledgeBaseIds) {
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }

        public Builder instruction(String instruction) {
            this.instruction = instruction;
            return this;
        }

        public AgenticRagTool build() {
            if (knowledgeBaseIds == null || knowledgeBaseIds.isEmpty()) {
                throw new IllegalArgumentException("At least one knowledge base ID is required.");
            }
            AgenticRagTool tool = new AgenticRagTool(knowledgeBaseIds, instruction);
            return tool;
        }
    }

    // Static builder entry point
    public static Builder builder() {
        return new Builder();
    }
}
