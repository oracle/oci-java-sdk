/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsAssociationParameter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsAssociationParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsAssociationParameter {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentId",
        "entityType",
        "entityId",
        "sourceId",
        "sourceDisplayName",
        "sourceType",
        "status",
        "missingProperties",
        "requiredProperties"
    })
    public LogAnalyticsAssociationParameter(
            String agentId,
            String entityType,
            String entityId,
            String sourceId,
            String sourceDisplayName,
            String sourceType,
            Status status,
            java.util.List<String> missingProperties,
            java.util.List<String> requiredProperties) {
        super();
        this.agentId = agentId;
        this.entityType = entityType;
        this.entityId = entityId;
        this.sourceId = sourceId;
        this.sourceDisplayName = sourceDisplayName;
        this.sourceType = sourceType;
        this.status = status;
        this.missingProperties = missingProperties;
        this.requiredProperties = requiredProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The agent unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The agent unique identifier.
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * The entity type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The entity type.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The entity unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity unique identifier.
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The source name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The source name.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The source display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        /**
         * The source display name.
         * @param sourceDisplayName the value to set
         * @return this builder
         **/
        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }
        /**
         * The source type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private String sourceType;

        /**
         * The source type.
         * @param sourceType the value to set
         * @return this builder
         **/
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The status.  Either FAILED or SUCCEEDED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status.  Either FAILED or SUCCEEDED.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * A list of missing properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("missingProperties")
        private java.util.List<String> missingProperties;

        /**
         * A list of missing properties.
         * @param missingProperties the value to set
         * @return this builder
         **/
        public Builder missingProperties(java.util.List<String> missingProperties) {
            this.missingProperties = missingProperties;
            this.__explicitlySet__.add("missingProperties");
            return this;
        }
        /**
         * A list of requried properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
        private java.util.List<String> requiredProperties;

        /**
         * A list of requried properties.
         * @param requiredProperties the value to set
         * @return this builder
         **/
        public Builder requiredProperties(java.util.List<String> requiredProperties) {
            this.requiredProperties = requiredProperties;
            this.__explicitlySet__.add("requiredProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsAssociationParameter build() {
            LogAnalyticsAssociationParameter __instance__ =
                    new LogAnalyticsAssociationParameter(
                            agentId,
                            entityType,
                            entityId,
                            sourceId,
                            sourceDisplayName,
                            sourceType,
                            status,
                            missingProperties,
                            requiredProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsAssociationParameter o) {
            Builder copiedBuilder =
                    agentId(o.getAgentId())
                            .entityType(o.getEntityType())
                            .entityId(o.getEntityId())
                            .sourceId(o.getSourceId())
                            .sourceDisplayName(o.getSourceDisplayName())
                            .sourceType(o.getSourceType())
                            .status(o.getStatus())
                            .missingProperties(o.getMissingProperties())
                            .requiredProperties(o.getRequiredProperties());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The agent unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The agent unique identifier.
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * The entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The entity type.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * The entity unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity unique identifier.
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The source name.
     * @return the value
     **/
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    private final String sourceDisplayName;

    /**
     * The source display name.
     * @return the value
     **/
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /**
     * The source type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final String sourceType;

    /**
     * The source type.
     * @return the value
     **/
    public String getSourceType() {
        return sourceType;
    }

    /**
     * The status.  Either FAILED or SUCCEEDED.
     **/
    public enum Status {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status.  Either FAILED or SUCCEEDED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status.  Either FAILED or SUCCEEDED.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * A list of missing properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("missingProperties")
    private final java.util.List<String> missingProperties;

    /**
     * A list of missing properties.
     * @return the value
     **/
    public java.util.List<String> getMissingProperties() {
        return missingProperties;
    }

    /**
     * A list of requried properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
    private final java.util.List<String> requiredProperties;

    /**
     * A list of requried properties.
     * @return the value
     **/
    public java.util.List<String> getRequiredProperties() {
        return requiredProperties;
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
        sb.append("LogAnalyticsAssociationParameter(");
        sb.append("agentId=").append(String.valueOf(this.agentId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", sourceDisplayName=").append(String.valueOf(this.sourceDisplayName));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", missingProperties=").append(String.valueOf(this.missingProperties));
        sb.append(", requiredProperties=").append(String.valueOf(this.requiredProperties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsAssociationParameter)) {
            return false;
        }

        LogAnalyticsAssociationParameter other = (LogAnalyticsAssociationParameter) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.sourceDisplayName, other.sourceDisplayName)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.missingProperties, other.missingProperties)
                && java.util.Objects.equals(this.requiredProperties, other.requiredProperties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDisplayName == null ? 43 : this.sourceDisplayName.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.missingProperties == null ? 43 : this.missingProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredProperties == null
                                ? 43
                                : this.requiredProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
