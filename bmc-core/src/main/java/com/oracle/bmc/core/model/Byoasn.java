/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Oracle offers the ability to Bring Your Own Autonomous System Number (BYOASN), importing AS Numbers you currently own to Oracle Cloud Infrastructure. A {@code Byoasn} resource is a record of the imported AS Number and also some associated metadata. The process used to [Bring Your Own ASN](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) is explained in the documentation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Byoasn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Byoasn extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "asn",
        "compartmentId",
        "timeValidated",
        "validationToken",
        "timeCreated",
        "timeUpdated",
        "byoipRanges"
    })
    public Byoasn(
            LifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            Long asn,
            String compartmentId,
            java.util.Date timeValidated,
            String validationToken,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ByoasnByoipRange> byoipRanges) {
        super();
        this.lifecycleState = lifecycleState;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.asn = asn;
        this.compartmentId = compartmentId;
        this.timeValidated = timeValidated;
        this.validationToken = validationToken;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.byoipRanges = byoipRanges;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The {@code Byoasn} resource's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The {@code Byoasn} resource's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asn")
        private Long asn;

        /**
         * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
         * @param asn the value to set
         * @return this builder
         **/
        public Builder asn(Long asn) {
            this.asn = asn;
            this.__explicitlySet__.add("asn");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Byoasn} resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Byoasn} resource.
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
         * The date and time the {@code Byoasn} resource was validated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
        private java.util.Date timeValidated;

        /**
         * The date and time the {@code Byoasn} resource was validated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeValidated the value to set
         * @return this builder
         **/
        public Builder timeValidated(java.util.Date timeValidated) {
            this.timeValidated = timeValidated;
            this.__explicitlySet__.add("timeValidated");
            return this;
        }
        /**
         * The validation token is an internally-generated ASCII string used in the validation process. See [Importing a Byoasn](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) for details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("validationToken")
        private String validationToken;

        /**
         * The validation token is an internally-generated ASCII string used in the validation process. See [Importing a Byoasn](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) for details.
         * @param validationToken the value to set
         * @return this builder
         **/
        public Builder validationToken(String validationToken) {
            this.validationToken = validationToken;
            this.__explicitlySet__.add("validationToken");
            return this;
        }
        /**
         * The date and time the {@code Byoasn} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the {@code Byoasn} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The date and time the {@code Byoasn} resource was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the {@code Byoasn} resource was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The BYOIP Ranges that has the {@code Byoasn} as origin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byoipRanges")
        private java.util.List<ByoasnByoipRange> byoipRanges;

        /**
         * The BYOIP Ranges that has the {@code Byoasn} as origin.
         * @param byoipRanges the value to set
         * @return this builder
         **/
        public Builder byoipRanges(java.util.List<ByoasnByoipRange> byoipRanges) {
            this.byoipRanges = byoipRanges;
            this.__explicitlySet__.add("byoipRanges");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Byoasn build() {
            Byoasn model =
                    new Byoasn(
                            this.lifecycleState,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.asn,
                            this.compartmentId,
                            this.timeValidated,
                            this.validationToken,
                            this.timeCreated,
                            this.timeUpdated,
                            this.byoipRanges);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Byoasn model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("asn")) {
                this.asn(model.getAsn());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeValidated")) {
                this.timeValidated(model.getTimeValidated());
            }
            if (model.wasPropertyExplicitlySet("validationToken")) {
                this.validationToken(model.getValidationToken());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("byoipRanges")) {
                this.byoipRanges(model.getByoipRanges());
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
     * The {@code Byoasn} resource's current state.
     **/
    public enum LifecycleState {
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Creating("CREATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The {@code Byoasn} resource's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The {@code Byoasn} resource's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asn")
    private final Long asn;

    /**
     * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
     * @return the value
     **/
    public Long getAsn() {
        return asn;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Byoasn} resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Byoasn} resource.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the {@code Byoasn} resource was validated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
    private final java.util.Date timeValidated;

    /**
     * The date and time the {@code Byoasn} resource was validated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeValidated() {
        return timeValidated;
    }

    /**
     * The validation token is an internally-generated ASCII string used in the validation process. See [Importing a Byoasn](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) for details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationToken")
    private final String validationToken;

    /**
     * The validation token is an internally-generated ASCII string used in the validation process. See [Importing a Byoasn](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) for details.
     * @return the value
     **/
    public String getValidationToken() {
        return validationToken;
    }

    /**
     * The date and time the {@code Byoasn} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the {@code Byoasn} resource was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the {@code Byoasn} resource was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the {@code Byoasn} resource was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The BYOIP Ranges that has the {@code Byoasn} as origin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoipRanges")
    private final java.util.List<ByoasnByoipRange> byoipRanges;

    /**
     * The BYOIP Ranges that has the {@code Byoasn} as origin.
     * @return the value
     **/
    public java.util.List<ByoasnByoipRange> getByoipRanges() {
        return byoipRanges;
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
        sb.append("Byoasn(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", asn=").append(String.valueOf(this.asn));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeValidated=").append(String.valueOf(this.timeValidated));
        sb.append(", validationToken=").append(String.valueOf(this.validationToken));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", byoipRanges=").append(String.valueOf(this.byoipRanges));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Byoasn)) {
            return false;
        }

        Byoasn other = (Byoasn) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.asn, other.asn)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeValidated, other.timeValidated)
                && java.util.Objects.equals(this.validationToken, other.validationToken)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.byoipRanges, other.byoipRanges)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.asn == null ? 43 : this.asn.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidated == null ? 43 : this.timeValidated.hashCode());
        result =
                (result * PRIME)
                        + (this.validationToken == null ? 43 : this.validationToken.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.byoipRanges == null ? 43 : this.byoipRanges.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
