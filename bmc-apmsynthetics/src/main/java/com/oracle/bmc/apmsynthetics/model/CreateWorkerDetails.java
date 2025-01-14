/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the request body used to create a new worker for an On-premise vantage point. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateWorkerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWorkerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "version",
        "resourcePrincipalTokenPublicKey",
        "configurationDetails",
        "workerType",
        "status",
        "priority",
        "freeformTags",
        "definedTags"
    })
    public CreateWorkerDetails(
            String name,
            String version,
            String resourcePrincipalTokenPublicKey,
            Object configurationDetails,
            OnPremiseVantagePointWorkerType workerType,
            OnPremiseVantagePointWorkerStatus status,
            Integer priority,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.version = version;
        this.resourcePrincipalTokenPublicKey = resourcePrincipalTokenPublicKey;
        this.configurationDetails = configurationDetails;
        this.workerType = workerType;
        this.status = status;
        this.priority = priority;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique On-premise VP worker name that cannot be edited. The name should not contain any
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique On-premise VP worker name that cannot be edited. The name should not contain any
         * confidential information.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Image version of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Image version of the On-premise VP worker.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** public key for resource Principal Token based validation to be used in further calls. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalTokenPublicKey")
        private String resourcePrincipalTokenPublicKey;

        /**
         * public key for resource Principal Token based validation to be used in further calls.
         *
         * @param resourcePrincipalTokenPublicKey the value to set
         * @return this builder
         */
        public Builder resourcePrincipalTokenPublicKey(String resourcePrincipalTokenPublicKey) {
            this.resourcePrincipalTokenPublicKey = resourcePrincipalTokenPublicKey;
            this.__explicitlySet__.add("resourcePrincipalTokenPublicKey");
            return this;
        }
        /** Configuration details of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private Object configurationDetails;

        /**
         * Configuration details of the On-premise VP worker.
         *
         * @param configurationDetails the value to set
         * @return this builder
         */
        public Builder configurationDetails(Object configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }
        /** Type of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("workerType")
        private OnPremiseVantagePointWorkerType workerType;

        /**
         * Type of the On-premise VP worker.
         *
         * @param workerType the value to set
         * @return this builder
         */
        public Builder workerType(OnPremiseVantagePointWorkerType workerType) {
            this.workerType = workerType;
            this.__explicitlySet__.add("workerType");
            return this;
        }
        /** Enables or disables the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OnPremiseVantagePointWorkerStatus status;

        /**
         * Enables or disables the On-premise VP worker.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(OnPremiseVantagePointWorkerStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Priority of the On-premise VP worker to schedule monitors. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Priority of the On-premise VP worker to schedule monitors.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWorkerDetails build() {
            CreateWorkerDetails model =
                    new CreateWorkerDetails(
                            this.name,
                            this.version,
                            this.resourcePrincipalTokenPublicKey,
                            this.configurationDetails,
                            this.workerType,
                            this.status,
                            this.priority,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWorkerDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("resourcePrincipalTokenPublicKey")) {
                this.resourcePrincipalTokenPublicKey(model.getResourcePrincipalTokenPublicKey());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("workerType")) {
                this.workerType(model.getWorkerType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique On-premise VP worker name that cannot be edited. The name should not contain any
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique On-premise VP worker name that cannot be edited. The name should not contain any
     * confidential information.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Image version of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Image version of the On-premise VP worker.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** public key for resource Principal Token based validation to be used in further calls. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePrincipalTokenPublicKey")
    private final String resourcePrincipalTokenPublicKey;

    /**
     * public key for resource Principal Token based validation to be used in further calls.
     *
     * @return the value
     */
    public String getResourcePrincipalTokenPublicKey() {
        return resourcePrincipalTokenPublicKey;
    }

    /** Configuration details of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final Object configurationDetails;

    /**
     * Configuration details of the On-premise VP worker.
     *
     * @return the value
     */
    public Object getConfigurationDetails() {
        return configurationDetails;
    }

    /** Type of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("workerType")
    private final OnPremiseVantagePointWorkerType workerType;

    /**
     * Type of the On-premise VP worker.
     *
     * @return the value
     */
    public OnPremiseVantagePointWorkerType getWorkerType() {
        return workerType;
    }

    /** Enables or disables the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OnPremiseVantagePointWorkerStatus status;

    /**
     * Enables or disables the On-premise VP worker.
     *
     * @return the value
     */
    public OnPremiseVantagePointWorkerStatus getStatus() {
        return status;
    }

    /** Priority of the On-premise VP worker to schedule monitors. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Priority of the On-premise VP worker to schedule monitors.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateWorkerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", resourcePrincipalTokenPublicKey=")
                .append(String.valueOf(this.resourcePrincipalTokenPublicKey));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(", workerType=").append(String.valueOf(this.workerType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWorkerDetails)) {
            return false;
        }

        CreateWorkerDetails other = (CreateWorkerDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.resourcePrincipalTokenPublicKey, other.resourcePrincipalTokenPublicKey)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(this.workerType, other.workerType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePrincipalTokenPublicKey == null
                                ? 43
                                : this.resourcePrincipalTokenPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result = (result * PRIME) + (this.workerType == null ? 43 : this.workerType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
