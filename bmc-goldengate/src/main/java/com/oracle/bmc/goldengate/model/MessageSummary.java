/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment message Summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MessageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MessageSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "deploymentMessage", "deploymentMessageStatus"})
    public MessageSummary(
            String id, String deploymentMessage, DeploymentMessageStatus deploymentMessageStatus) {
        super();
        this.id = id;
        this.deploymentMessage = deploymentMessage;
        this.deploymentMessageStatus = deploymentMessageStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The deployment Message Id.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The deployment Message Id.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The deployment Message in plain text with optional HTML anchor tags.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentMessage")
        private String deploymentMessage;

        /**
         * The deployment Message in plain text with optional HTML anchor tags.
         *
         * @param deploymentMessage the value to set
         * @return this builder
         **/
        public Builder deploymentMessage(String deploymentMessage) {
            this.deploymentMessage = deploymentMessage;
            this.__explicitlySet__.add("deploymentMessage");
            return this;
        }
        /**
         * The deployment Message Status.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentMessageStatus")
        private DeploymentMessageStatus deploymentMessageStatus;

        /**
         * The deployment Message Status.
         *
         * @param deploymentMessageStatus the value to set
         * @return this builder
         **/
        public Builder deploymentMessageStatus(DeploymentMessageStatus deploymentMessageStatus) {
            this.deploymentMessageStatus = deploymentMessageStatus;
            this.__explicitlySet__.add("deploymentMessageStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MessageSummary build() {
            MessageSummary model =
                    new MessageSummary(
                            this.id, this.deploymentMessage, this.deploymentMessageStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MessageSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("deploymentMessage")) {
                this.deploymentMessage(model.getDeploymentMessage());
            }
            if (model.wasPropertyExplicitlySet("deploymentMessageStatus")) {
                this.deploymentMessageStatus(model.getDeploymentMessageStatus());
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
     * The deployment Message Id.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The deployment Message Id.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The deployment Message in plain text with optional HTML anchor tags.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentMessage")
    private final String deploymentMessage;

    /**
     * The deployment Message in plain text with optional HTML anchor tags.
     *
     * @return the value
     **/
    public String getDeploymentMessage() {
        return deploymentMessage;
    }

    /**
     * The deployment Message Status.
     *
     **/
    public enum DeploymentMessageStatus {
        Info("INFO"),
        Warning("WARNING"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeploymentMessageStatus.class);

        private final String value;
        private static java.util.Map<String, DeploymentMessageStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DeploymentMessageStatus v : DeploymentMessageStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeploymentMessageStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeploymentMessageStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeploymentMessageStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The deployment Message Status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentMessageStatus")
    private final DeploymentMessageStatus deploymentMessageStatus;

    /**
     * The deployment Message Status.
     *
     * @return the value
     **/
    public DeploymentMessageStatus getDeploymentMessageStatus() {
        return deploymentMessageStatus;
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
        sb.append("MessageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", deploymentMessage=").append(String.valueOf(this.deploymentMessage));
        sb.append(", deploymentMessageStatus=")
                .append(String.valueOf(this.deploymentMessageStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageSummary)) {
            return false;
        }

        MessageSummary other = (MessageSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.deploymentMessage, other.deploymentMessage)
                && java.util.Objects.equals(
                        this.deploymentMessageStatus, other.deploymentMessageStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentMessage == null ? 43 : this.deploymentMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentMessageStatus == null
                                ? 43
                                : this.deploymentMessageStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
