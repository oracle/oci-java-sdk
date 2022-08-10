/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The command payload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommand.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentCommand extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "isCanceled",
        "executionTimeOutInSeconds",
        "target",
        "content"
    })
    public InstanceAgentCommand(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isCanceled,
            Integer executionTimeOutInSeconds,
            InstanceAgentCommandTarget target,
            InstanceAgentCommandContent content) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isCanceled = isCanceled;
        this.executionTimeOutInSeconds = executionTimeOutInSeconds;
        this.target = target;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the command.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the command.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the command.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the command.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the command was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the command was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the command was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the command was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Whether a request was made to cancel the command. Canceling a command is a best-effort attempt.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
        private Boolean isCanceled;

        /**
         * Whether a request was made to cancel the command. Canceling a command is a best-effort attempt.
         * @param isCanceled the value to set
         * @return this builder
         **/
        public Builder isCanceled(Boolean isCanceled) {
            this.isCanceled = isCanceled;
            this.__explicitlySet__.add("isCanceled");
            return this;
        }
        /**
         * The amount of time that Oracle Cloud Agent is given to run the command on the instance before timing
         * out. The timer starts when Oracle Cloud Agent starts the command. Zero means no timeout.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
        private Integer executionTimeOutInSeconds;

        /**
         * The amount of time that Oracle Cloud Agent is given to run the command on the instance before timing
         * out. The timer starts when Oracle Cloud Agent starts the command. Zero means no timeout.
         *
         * @param executionTimeOutInSeconds the value to set
         * @return this builder
         **/
        public Builder executionTimeOutInSeconds(Integer executionTimeOutInSeconds) {
            this.executionTimeOutInSeconds = executionTimeOutInSeconds;
            this.__explicitlySet__.add("executionTimeOutInSeconds");
            return this;
        }
        /**
         * The target instance that the command runs on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private InstanceAgentCommandTarget target;

        /**
         * The target instance that the command runs on.
         * @param target the value to set
         * @return this builder
         **/
        public Builder target(InstanceAgentCommandTarget target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * The contents of the command.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private InstanceAgentCommandContent content;

        /**
         * The contents of the command.
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(InstanceAgentCommandContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommand build() {
            InstanceAgentCommand model =
                    new InstanceAgentCommand(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isCanceled,
                            this.executionTimeOutInSeconds,
                            this.target,
                            this.content);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommand model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isCanceled")) {
                this.isCanceled(model.getIsCanceled());
            }
            if (model.wasPropertyExplicitlySet("executionTimeOutInSeconds")) {
                this.executionTimeOutInSeconds(model.getExecutionTimeOutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the command.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the command.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the command was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the command was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the command was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the command was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Whether a request was made to cancel the command. Canceling a command is a best-effort attempt.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
    private final Boolean isCanceled;

    /**
     * Whether a request was made to cancel the command. Canceling a command is a best-effort attempt.
     * @return the value
     **/
    public Boolean getIsCanceled() {
        return isCanceled;
    }

    /**
     * The amount of time that Oracle Cloud Agent is given to run the command on the instance before timing
     * out. The timer starts when Oracle Cloud Agent starts the command. Zero means no timeout.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
    private final Integer executionTimeOutInSeconds;

    /**
     * The amount of time that Oracle Cloud Agent is given to run the command on the instance before timing
     * out. The timer starts when Oracle Cloud Agent starts the command. Zero means no timeout.
     *
     * @return the value
     **/
    public Integer getExecutionTimeOutInSeconds() {
        return executionTimeOutInSeconds;
    }

    /**
     * The target instance that the command runs on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final InstanceAgentCommandTarget target;

    /**
     * The target instance that the command runs on.
     * @return the value
     **/
    public InstanceAgentCommandTarget getTarget() {
        return target;
    }

    /**
     * The contents of the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final InstanceAgentCommandContent content;

    /**
     * The contents of the command.
     * @return the value
     **/
    public InstanceAgentCommandContent getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceAgentCommand(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isCanceled=").append(String.valueOf(this.isCanceled));
        sb.append(", executionTimeOutInSeconds=")
                .append(String.valueOf(this.executionTimeOutInSeconds));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommand)) {
            return false;
        }

        InstanceAgentCommand other = (InstanceAgentCommand) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isCanceled, other.isCanceled)
                && java.util.Objects.equals(
                        this.executionTimeOutInSeconds, other.executionTimeOutInSeconds)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.content, other.content)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.isCanceled == null ? 43 : this.isCanceled.hashCode());
        result =
                (result * PRIME)
                        + (this.executionTimeOutInSeconds == null
                                ? 43
                                : this.executionTimeOutInSeconds.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
