/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Entity details including whether or not it is eligible for association with the source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssociableEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociableEntity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityId",
        "entityName",
        "entityTypeName",
        "entityTypeDisplayName",
        "host",
        "agentId",
        "eligibilityStatus",
        "ineligibilityDetails"
    })
    public AssociableEntity(
            String entityId,
            String entityName,
            String entityTypeName,
            String entityTypeDisplayName,
            String host,
            String agentId,
            EligibilityStatus eligibilityStatus,
            String ineligibilityDetails) {
        super();
        this.entityId = entityId;
        this.entityName = entityName;
        this.entityTypeName = entityTypeName;
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.host = host;
        this.agentId = agentId;
        this.eligibilityStatus = eligibilityStatus;
        this.ineligibilityDetails = ineligibilityDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The entity OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity OCID.
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The name of the entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The name of the entity.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /** The type name of the entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        /**
         * The type name of the entity.
         *
         * @param entityTypeName the value to set
         * @return this builder
         */
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }
        /** The display name of the entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        /**
         * The display name of the entity type.
         *
         * @param entityTypeDisplayName the value to set
         * @return this builder
         */
        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }
        /** The entity host. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The entity host.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The OCID of the Management Agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The OCID of the Management Agent.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * This field indicates whether the entity is (in)eligible to be associated with this
         * source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eligibilityStatus")
        private EligibilityStatus eligibilityStatus;

        /**
         * This field indicates whether the entity is (in)eligible to be associated with this
         * source.
         *
         * @param eligibilityStatus the value to set
         * @return this builder
         */
        public Builder eligibilityStatus(EligibilityStatus eligibilityStatus) {
            this.eligibilityStatus = eligibilityStatus;
            this.__explicitlySet__.add("eligibilityStatus");
            return this;
        }
        /** The reason the entity is not eligible for association. */
        @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityDetails")
        private String ineligibilityDetails;

        /**
         * The reason the entity is not eligible for association.
         *
         * @param ineligibilityDetails the value to set
         * @return this builder
         */
        public Builder ineligibilityDetails(String ineligibilityDetails) {
            this.ineligibilityDetails = ineligibilityDetails;
            this.__explicitlySet__.add("ineligibilityDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociableEntity build() {
            AssociableEntity model =
                    new AssociableEntity(
                            this.entityId,
                            this.entityName,
                            this.entityTypeName,
                            this.entityTypeDisplayName,
                            this.host,
                            this.agentId,
                            this.eligibilityStatus,
                            this.ineligibilityDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociableEntity model) {
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("entityTypeName")) {
                this.entityTypeName(model.getEntityTypeName());
            }
            if (model.wasPropertyExplicitlySet("entityTypeDisplayName")) {
                this.entityTypeDisplayName(model.getEntityTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("eligibilityStatus")) {
                this.eligibilityStatus(model.getEligibilityStatus());
            }
            if (model.wasPropertyExplicitlySet("ineligibilityDetails")) {
                this.ineligibilityDetails(model.getIneligibilityDetails());
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

    /** The entity OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity OCID.
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The name of the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The name of the entity.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /** The type name of the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    private final String entityTypeName;

    /**
     * The type name of the entity.
     *
     * @return the value
     */
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /** The display name of the entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    private final String entityTypeDisplayName;

    /**
     * The display name of the entity type.
     *
     * @return the value
     */
    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    /** The entity host. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The entity host.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The OCID of the Management Agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The OCID of the Management Agent.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * This field indicates whether the entity is (in)eligible to be associated with this source.
     */
    public enum EligibilityStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Eligible("ELIGIBLE"),
        Ineligible("INELIGIBLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EligibilityStatus.class);

        private final String value;
        private static java.util.Map<String, EligibilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (EligibilityStatus v : EligibilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EligibilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EligibilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EligibilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This field indicates whether the entity is (in)eligible to be associated with this source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eligibilityStatus")
    private final EligibilityStatus eligibilityStatus;

    /**
     * This field indicates whether the entity is (in)eligible to be associated with this source.
     *
     * @return the value
     */
    public EligibilityStatus getEligibilityStatus() {
        return eligibilityStatus;
    }

    /** The reason the entity is not eligible for association. */
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityDetails")
    private final String ineligibilityDetails;

    /**
     * The reason the entity is not eligible for association.
     *
     * @return the value
     */
    public String getIneligibilityDetails() {
        return ineligibilityDetails;
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
        sb.append("AssociableEntity(");
        sb.append("super=").append(super.toString());
        sb.append("entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(", entityTypeDisplayName=").append(String.valueOf(this.entityTypeDisplayName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", eligibilityStatus=").append(String.valueOf(this.eligibilityStatus));
        sb.append(", ineligibilityDetails=").append(String.valueOf(this.ineligibilityDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociableEntity)) {
            return false;
        }

        AssociableEntity other = (AssociableEntity) o;
        return java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.entityTypeDisplayName, other.entityTypeDisplayName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.eligibilityStatus, other.eligibilityStatus)
                && java.util.Objects.equals(this.ineligibilityDetails, other.ineligibilityDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeDisplayName == null
                                ? 43
                                : this.entityTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.eligibilityStatus == null ? 43 : this.eligibilityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ineligibilityDetails == null
                                ? 43
                                : this.ineligibilityDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
