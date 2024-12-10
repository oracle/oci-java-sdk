/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about a ComplianceDetail.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComplianceRecordSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComplianceRecordSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "entityId",
        "entityDisplayName",
        "compartmentId",
        "policy",
        "resource",
        "target",
        "patch",
        "complianceState",
        "timeCreated",
        "timeUpdated",
        "lifecycleState"
    })
    public ComplianceRecordSummary(
            String id,
            String entityId,
            String entityDisplayName,
            String compartmentId,
            ComplianceDetailPolicy policy,
            ComplianceDetailResource resource,
            ComplianceDetailTarget target,
            CompliancePatchDetail patch,
            ComplianceState complianceState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ComplianceRecord.LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.entityId = entityId;
        this.entityDisplayName = entityDisplayName;
        this.compartmentId = compartmentId;
        this.policy = policy;
        this.resource = resource;
        this.target = target;
        this.patch = patch;
        this.complianceState = complianceState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the ComplianceRecord.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the ComplianceRecord.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the entity for which the compliance is calculated.Ex.FleetId
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The OCID of the entity for which the compliance is calculated.Ex.FleetId
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The displayName of the entity for which the compliance is calculated.Ex.DisplayName for the Fleet
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
        private String entityDisplayName;

        /**
         * The displayName of the entity for which the compliance is calculated.Ex.DisplayName for the Fleet
         * @param entityDisplayName the value to set
         * @return this builder
         **/
        public Builder entityDisplayName(String entityDisplayName) {
            this.entityDisplayName = entityDisplayName;
            this.__explicitlySet__.add("entityDisplayName");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private ComplianceDetailPolicy policy;

        public Builder policy(ComplianceDetailPolicy policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resource")
        private ComplianceDetailResource resource;

        public Builder resource(ComplianceDetailResource resource) {
            this.resource = resource;
            this.__explicitlySet__.add("resource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private ComplianceDetailTarget target;

        public Builder target(ComplianceDetailTarget target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patch")
        private CompliancePatchDetail patch;

        public Builder patch(CompliancePatchDetail patch) {
            this.patch = patch;
            this.__explicitlySet__.add("patch");
            return this;
        }
        /**
         * Last known compliance state of target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * Last known compliance state of target.
         * @param complianceState the value to set
         * @return this builder
         **/
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /**
         * The date and time the ComplianceRecord was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the ComplianceRecord was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the ComplianceRecord was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the ComplianceRecord was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The current state of the ComplianceRecord.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComplianceRecord.LifecycleState lifecycleState;

        /**
         * The current state of the ComplianceRecord.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ComplianceRecord.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceRecordSummary build() {
            ComplianceRecordSummary model =
                    new ComplianceRecordSummary(
                            this.id,
                            this.entityId,
                            this.entityDisplayName,
                            this.compartmentId,
                            this.policy,
                            this.resource,
                            this.target,
                            this.patch,
                            this.complianceState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceRecordSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityDisplayName")) {
                this.entityDisplayName(model.getEntityDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("resource")) {
                this.resource(model.getResource());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("patch")) {
                this.patch(model.getPatch());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The OCID of the ComplianceRecord.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the ComplianceRecord.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the entity for which the compliance is calculated.Ex.FleetId
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The OCID of the entity for which the compliance is calculated.Ex.FleetId
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The displayName of the entity for which the compliance is calculated.Ex.DisplayName for the Fleet
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
    private final String entityDisplayName;

    /**
     * The displayName of the entity for which the compliance is calculated.Ex.DisplayName for the Fleet
     * @return the value
     **/
    public String getEntityDisplayName() {
        return entityDisplayName;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final ComplianceDetailPolicy policy;

    public ComplianceDetailPolicy getPolicy() {
        return policy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final ComplianceDetailResource resource;

    public ComplianceDetailResource getResource() {
        return resource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final ComplianceDetailTarget target;

    public ComplianceDetailTarget getTarget() {
        return target;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patch")
    private final CompliancePatchDetail patch;

    public CompliancePatchDetail getPatch() {
        return patch;
    }

    /**
     * Last known compliance state of target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * Last known compliance state of target.
     * @return the value
     **/
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /**
     * The date and time the ComplianceRecord was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the ComplianceRecord was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the ComplianceRecord was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the ComplianceRecord was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the ComplianceRecord.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComplianceRecord.LifecycleState lifecycleState;

    /**
     * The current state of the ComplianceRecord.
     * @return the value
     **/
    public ComplianceRecord.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("ComplianceRecordSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityDisplayName=").append(String.valueOf(this.entityDisplayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", resource=").append(String.valueOf(this.resource));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", patch=").append(String.valueOf(this.patch));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceRecordSummary)) {
            return false;
        }

        ComplianceRecordSummary other = (ComplianceRecordSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityDisplayName, other.entityDisplayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.resource, other.resource)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.patch, other.patch)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result =
                (result * PRIME)
                        + (this.entityDisplayName == null ? 43 : this.entityDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.patch == null ? 43 : this.patch.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
