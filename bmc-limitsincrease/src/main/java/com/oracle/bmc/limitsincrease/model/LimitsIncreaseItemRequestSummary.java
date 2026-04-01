/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.model;

/**
 * A summary of properties for a limit increase item within the indicated limit increase request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LimitsIncreaseItemRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitsIncreaseItemRequestSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "region",
        "scope",
        "serviceName",
        "limitName",
        "value",
        "currentValue",
        "limitsIncreaseRequestId",
        "timeCreated",
        "lifecycleState"
    })
    public LimitsIncreaseItemRequestSummary(
            String id,
            String compartmentId,
            String region,
            String scope,
            String serviceName,
            String limitName,
            Long value,
            Long currentValue,
            String limitsIncreaseRequestId,
            java.util.Date timeCreated,
            LimitsIncreaseItemRequest.LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.region = region;
        this.scope = scope;
        this.serviceName = serviceName;
        this.limitName = limitName;
        this.value = value;
        this.currentValue = currentValue;
        this.limitsIncreaseRequestId = limitsIncreaseRequestId;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase item.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase item.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the limit increase item.
         * Note: The tenancy is the root compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the limit increase item.
         * Note: The tenancy is the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The region code for the limit increase item.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region code for the limit increase item.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The scope of the limit increase item.
         * For OCI, use the logical availability domain (AD) of the request.
         * For Multicloud, use the availability zone (AZ) of the request
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * The scope of the limit increase item.
         * For OCI, use the logical availability domain (AD) of the request.
         * For Multicloud, use the availability zone (AZ) of the request
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The name of the service that owns the limit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the service that owns the limit.
         *
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * The name of the limit to be increased.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitName")
        private String limitName;

        /**
         * The name of the limit to be increased.
         *
         * @param limitName the value to set
         * @return this builder
         **/
        public Builder limitName(String limitName) {
            this.limitName = limitName;
            this.__explicitlySet__.add("limitName");
            return this;
        }
        /**
         * The requested value for the limit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Long value;

        /**
         * The requested value for the limit.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Long value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The value of the limit for the tenancy at the time of the request. Purely informative.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentValue")
        private Long currentValue;

        /**
         * The value of the limit for the tenancy at the time of the request. Purely informative.
         * @param currentValue the value to set
         * @return this builder
         **/
        public Builder currentValue(Long currentValue) {
            this.currentValue = currentValue;
            this.__explicitlySet__.add("currentValue");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request that the limit increase item belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitsIncreaseRequestId")
        private String limitsIncreaseRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request that the limit increase item belongs to.
         * @param limitsIncreaseRequestId the value to set
         * @return this builder
         **/
        public Builder limitsIncreaseRequestId(String limitsIncreaseRequestId) {
            this.limitsIncreaseRequestId = limitsIncreaseRequestId;
            this.__explicitlySet__.add("limitsIncreaseRequestId");
            return this;
        }
        /**
         * The time that the limit increase request was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time that the limit increase request was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current status of the limit increase item.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LimitsIncreaseItemRequest.LifecycleState lifecycleState;

        /**
         * The current status of the limit increase item.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LimitsIncreaseItemRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitsIncreaseItemRequestSummary build() {
            LimitsIncreaseItemRequestSummary model =
                    new LimitsIncreaseItemRequestSummary(
                            this.id,
                            this.compartmentId,
                            this.region,
                            this.scope,
                            this.serviceName,
                            this.limitName,
                            this.value,
                            this.currentValue,
                            this.limitsIncreaseRequestId,
                            this.timeCreated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitsIncreaseItemRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("limitName")) {
                this.limitName(model.getLimitName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("currentValue")) {
                this.currentValue(model.getCurrentValue());
            }
            if (model.wasPropertyExplicitlySet("limitsIncreaseRequestId")) {
                this.limitsIncreaseRequestId(model.getLimitsIncreaseRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase item.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase item.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the limit increase item.
     * Note: The tenancy is the root compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the limit increase item.
     * Note: The tenancy is the root compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The region code for the limit increase item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region code for the limit increase item.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The scope of the limit increase item.
     * For OCI, use the logical availability domain (AD) of the request.
     * For Multicloud, use the availability zone (AZ) of the request
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * The scope of the limit increase item.
     * For OCI, use the logical availability domain (AD) of the request.
     * For Multicloud, use the availability zone (AZ) of the request
     *
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * The name of the service that owns the limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the service that owns the limit.
     *
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * The name of the limit to be increased.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitName")
    private final String limitName;

    /**
     * The name of the limit to be increased.
     *
     * @return the value
     **/
    public String getLimitName() {
        return limitName;
    }

    /**
     * The requested value for the limit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Long value;

    /**
     * The requested value for the limit.
     * @return the value
     **/
    public Long getValue() {
        return value;
    }

    /**
     * The value of the limit for the tenancy at the time of the request. Purely informative.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentValue")
    private final Long currentValue;

    /**
     * The value of the limit for the tenancy at the time of the request. Purely informative.
     * @return the value
     **/
    public Long getCurrentValue() {
        return currentValue;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request that the limit increase item belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitsIncreaseRequestId")
    private final String limitsIncreaseRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the limit increase request that the limit increase item belongs to.
     * @return the value
     **/
    public String getLimitsIncreaseRequestId() {
        return limitsIncreaseRequestId;
    }

    /**
     * The time that the limit increase request was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time that the limit increase request was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current status of the limit increase item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LimitsIncreaseItemRequest.LifecycleState lifecycleState;

    /**
     * The current status of the limit increase item.
     * @return the value
     **/
    public LimitsIncreaseItemRequest.LifecycleState getLifecycleState() {
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
        sb.append("LimitsIncreaseItemRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limitName=").append(String.valueOf(this.limitName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", currentValue=").append(String.valueOf(this.currentValue));
        sb.append(", limitsIncreaseRequestId=")
                .append(String.valueOf(this.limitsIncreaseRequestId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitsIncreaseItemRequestSummary)) {
            return false;
        }

        LimitsIncreaseItemRequestSummary other = (LimitsIncreaseItemRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limitName, other.limitName)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.currentValue, other.currentValue)
                && java.util.Objects.equals(
                        this.limitsIncreaseRequestId, other.limitsIncreaseRequestId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limitName == null ? 43 : this.limitName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.currentValue == null ? 43 : this.currentValue.hashCode());
        result =
                (result * PRIME)
                        + (this.limitsIncreaseRequestId == null
                                ? 43
                                : this.limitsIncreaseRequestId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
