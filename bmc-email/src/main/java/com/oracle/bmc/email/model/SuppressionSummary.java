/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * The full information representing a suppression.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SuppressionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SuppressionSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "emailAddress",
        "id",
        "reason",
        "timeCreated"
    })
    public SuppressionSummary(
            String compartmentId,
            String emailAddress,
            String id,
            Reason reason,
            java.util.Date timeCreated) {
        super();
        this.compartmentId = compartmentId;
        this.emailAddress = emailAddress;
        this.id = id;
        this.reason = reason;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID for the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID for the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The email address of the suppression.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * The email address of the suppression.
         * @param emailAddress the value to set
         * @return this builder
         **/
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }
        /**
         * The unique OCID of the suppression.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique OCID of the suppression.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The reason that the email address was suppressed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private Reason reason;

        /**
         * The reason that the email address was suppressed.
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(Reason reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /**
         * The date and time a recipient's email address was added to the
         * suppression list, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time a recipient's email address was added to the
         * suppression list, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuppressionSummary build() {
            SuppressionSummary model =
                    new SuppressionSummary(
                            this.compartmentId,
                            this.emailAddress,
                            this.id,
                            this.reason,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuppressionSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("emailAddress")) {
                this.emailAddress(model.getEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The OCID for the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID for the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The email address of the suppression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * The email address of the suppression.
     * @return the value
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * The unique OCID of the suppression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique OCID of the suppression.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The reason that the email address was suppressed.
     **/
    public enum Reason {
        Unknown("UNKNOWN"),
        Hardbounce("HARDBOUNCE"),
        Complaint("COMPLAINT"),
        Manual("MANUAL"),
        Softbounce("SOFTBOUNCE"),
        Unsubscribe("UNSUBSCRIBE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Reason.class);

        private final String value;
        private static java.util.Map<String, Reason> map;

        static {
            map = new java.util.HashMap<>();
            for (Reason v : Reason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Reason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Reason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Reason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The reason that the email address was suppressed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final Reason reason;

    /**
     * The reason that the email address was suppressed.
     * @return the value
     **/
    public Reason getReason() {
        return reason;
    }

    /**
     * The date and time a recipient's email address was added to the
     * suppression list, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time a recipient's email address was added to the
     * suppression list, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("SuppressionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuppressionSummary)) {
            return false;
        }

        SuppressionSummary other = (SuppressionSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
