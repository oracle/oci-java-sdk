/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Subscription mapping information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubscriptionMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "subscriptionId",
        "compartmentId",
        "isExplicitlyAssigned",
        "lifecycleState",
        "timeTerminated",
        "timeCreated",
        "timeUpdated"
    })
    public SubscriptionMapping(
            String id,
            String subscriptionId,
            String compartmentId,
            Boolean isExplicitlyAssigned,
            LifecycleState lifecycleState,
            java.util.Date timeTerminated,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.compartmentId = compartmentId;
        this.isExplicitlyAssigned = isExplicitlyAssigned;
        this.lifecycleState = lifecycleState;
        this.timeTerminated = timeTerminated;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the mapping between subscription and compartment identified by the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the mapping between subscription and compartment identified by the tenancy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * OCID of the subscription.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** OCID of the compartment. Always a tenancy OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment. Always a tenancy OCID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Denotes if the subscription is explicity assigned to the root compartment or tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("isExplicitlyAssigned")
        private Boolean isExplicitlyAssigned;

        /**
         * Denotes if the subscription is explicity assigned to the root compartment or tenancy.
         *
         * @param isExplicitlyAssigned the value to set
         * @return this builder
         */
        public Builder isExplicitlyAssigned(Boolean isExplicitlyAssigned) {
            this.isExplicitlyAssigned = isExplicitlyAssigned;
            this.__explicitlySet__.add("isExplicitlyAssigned");
            return this;
        }
        /** Lifecycle state of the subscriptionMapping. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the subscriptionMapping.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Date-time when subscription mapping was terminated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * Date-time when subscription mapping was terminated.
         *
         * @param timeTerminated the value to set
         * @return this builder
         */
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
            return this;
        }
        /** Date-time when subscription mapping was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date-time when subscription mapping was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Date-time when subscription mapping was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date-time when subscription mapping was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionMapping build() {
            SubscriptionMapping model =
                    new SubscriptionMapping(
                            this.id,
                            this.subscriptionId,
                            this.compartmentId,
                            this.isExplicitlyAssigned,
                            this.lifecycleState,
                            this.timeTerminated,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionMapping model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isExplicitlyAssigned")) {
                this.isExplicitlyAssigned(model.getIsExplicitlyAssigned());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeTerminated")) {
                this.timeTerminated(model.getTimeTerminated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** OCID of the mapping between subscription and compartment identified by the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the mapping between subscription and compartment identified by the tenancy.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * OCID of the subscription.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** OCID of the compartment. Always a tenancy OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment. Always a tenancy OCID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Denotes if the subscription is explicity assigned to the root compartment or tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("isExplicitlyAssigned")
    private final Boolean isExplicitlyAssigned;

    /**
     * Denotes if the subscription is explicity assigned to the root compartment or tenancy.
     *
     * @return the value
     */
    public Boolean getIsExplicitlyAssigned() {
        return isExplicitlyAssigned;
    }

    /** Lifecycle state of the subscriptionMapping. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Lifecycle state of the subscriptionMapping. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the subscriptionMapping.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Date-time when subscription mapping was terminated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * Date-time when subscription mapping was terminated.
     *
     * @return the value
     */
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
    }

    /** Date-time when subscription mapping was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date-time when subscription mapping was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Date-time when subscription mapping was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date-time when subscription mapping was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("SubscriptionMapping(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isExplicitlyAssigned=").append(String.valueOf(this.isExplicitlyAssigned));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeTerminated=").append(String.valueOf(this.timeTerminated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionMapping)) {
            return false;
        }

        SubscriptionMapping other = (SubscriptionMapping) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isExplicitlyAssigned, other.isExplicitlyAssigned)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeTerminated, other.timeTerminated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isExplicitlyAssigned == null
                                ? 43
                                : this.isExplicitlyAssigned.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTerminated == null ? 43 : this.timeTerminated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
