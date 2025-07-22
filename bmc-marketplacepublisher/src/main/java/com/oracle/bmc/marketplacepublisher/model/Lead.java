/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Details of Lead <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Lead.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Lead extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingId",
        "listingName",
        "compartmentId",
        "lifecycleState",
        "timeCreated",
        "additionalInfo"
    })
    public Lead(
            String id,
            String listingId,
            String listingName,
            String compartmentId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            AdditionalInfo additionalInfo) {
        super();
        this.id = id;
        this.listingId = listingId;
        this.listingName = listingName;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.additionalInfo = additionalInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique OCID identifier for the lead. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID identifier for the lead.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID for the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID for the listing.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The Name for the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingName")
        private String listingName;

        /**
         * The Name for the listing.
         *
         * @param listingName the value to set
         * @return this builder
         */
        public Builder listingName(String listingName) {
            this.listingName = listingName;
            this.__explicitlySet__.add("listingName");
            return this;
        }
        /** The OCID for the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The state for the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state for the listing.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the listing was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2023-03-27T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the listing was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2023-03-27T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
        private AdditionalInfo additionalInfo;

        public Builder additionalInfo(AdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
            this.__explicitlySet__.add("additionalInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Lead build() {
            Lead model =
                    new Lead(
                            this.id,
                            this.listingId,
                            this.listingName,
                            this.compartmentId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.additionalInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Lead model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("listingName")) {
                this.listingName(model.getListingName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("additionalInfo")) {
                this.additionalInfo(model.getAdditionalInfo());
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

    /** Unique OCID identifier for the lead. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier for the lead.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID for the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID for the listing.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The Name for the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingName")
    private final String listingName;

    /**
     * The Name for the listing.
     *
     * @return the value
     */
    public String getListingName() {
        return listingName;
    }

    /** The OCID for the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID for the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The state for the listing. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),

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
    /** The state for the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state for the listing.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the listing was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2023-03-27T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the listing was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2023-03-27T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
    private final AdditionalInfo additionalInfo;

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
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
        sb.append("Lead(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingName=").append(String.valueOf(this.listingName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", additionalInfo=").append(String.valueOf(this.additionalInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Lead)) {
            return false;
        }

        Lead other = (Lead) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.listingName, other.listingName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.additionalInfo, other.additionalInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.listingName == null ? 43 : this.listingName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalInfo == null ? 43 : this.additionalInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
