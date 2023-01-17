/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Promotion information for a subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Promotion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Promotion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "duration",
        "durationUnit",
        "amount",
        "status",
        "isIntentToPay",
        "currencyUnit",
        "timeStarted",
        "timeExpired"
    })
    public Promotion(
            Integer duration,
            String durationUnit,
            Float amount,
            Status status,
            Boolean isIntentToPay,
            String currencyUnit,
            java.util.Date timeStarted,
            java.util.Date timeExpired) {
        super();
        this.duration = duration;
        this.durationUnit = durationUnit;
        this.amount = amount;
        this.status = status;
        this.isIntentToPay = isIntentToPay;
        this.currencyUnit = currencyUnit;
        this.timeStarted = timeStarted;
        this.timeExpired = timeExpired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * How long the promotion related to the subscription, if any, is valid in duration units.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * How long the promotion related to the subscription, if any, is valid in duration units.
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * Unit for the duration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationUnit")
        private String durationUnit;

        /**
         * Unit for the duration.
         * @param durationUnit the value to set
         * @return this builder
         **/
        public Builder durationUnit(String durationUnit) {
            this.durationUnit = durationUnit;
            this.__explicitlySet__.add("durationUnit");
            return this;
        }
        /**
         * Total amount of credit for the promotion related to the subscription if there is one.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private Float amount;

        /**
         * Total amount of credit for the promotion related to the subscription if there is one.
         * @param amount the value to set
         * @return this builder
         **/
        public Builder amount(Float amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }
        /**
         * Current status of the promotion related to the subscription if there is one.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Current status of the promotion related to the subscription if there is one.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Whether or not customer intends to pay once the promotion is done.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        /**
         * Whether or not customer intends to pay once the promotion is done.
         * @param isIntentToPay the value to set
         * @return this builder
         **/
        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }
        /**
         * Currency unit associated with the promotion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyUnit")
        private String currencyUnit;

        /**
         * Currency unit associated with the promotion.
         * @param currencyUnit the value to set
         * @return this builder
         **/
        public Builder currencyUnit(String currencyUnit) {
            this.currencyUnit = currencyUnit;
            this.__explicitlySet__.add("currencyUnit");
            return this;
        }
        /**
         * Date-time for when the promotion starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Date-time for when the promotion starts.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Date-time for when the promotion ends.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * Date-time for when the promotion ends.
         * @param timeExpired the value to set
         * @return this builder
         **/
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Promotion build() {
            Promotion model =
                    new Promotion(
                            this.duration,
                            this.durationUnit,
                            this.amount,
                            this.status,
                            this.isIntentToPay,
                            this.currencyUnit,
                            this.timeStarted,
                            this.timeExpired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Promotion model) {
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("durationUnit")) {
                this.durationUnit(model.getDurationUnit());
            }
            if (model.wasPropertyExplicitlySet("amount")) {
                this.amount(model.getAmount());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("isIntentToPay")) {
                this.isIntentToPay(model.getIsIntentToPay());
            }
            if (model.wasPropertyExplicitlySet("currencyUnit")) {
                this.currencyUnit(model.getCurrencyUnit());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeExpired")) {
                this.timeExpired(model.getTimeExpired());
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
     * How long the promotion related to the subscription, if any, is valid in duration units.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * How long the promotion related to the subscription, if any, is valid in duration units.
     * @return the value
     **/
    public Integer getDuration() {
        return duration;
    }

    /**
     * Unit for the duration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationUnit")
    private final String durationUnit;

    /**
     * Unit for the duration.
     * @return the value
     **/
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * Total amount of credit for the promotion related to the subscription if there is one.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    private final Float amount;

    /**
     * Total amount of credit for the promotion related to the subscription if there is one.
     * @return the value
     **/
    public Float getAmount() {
        return amount;
    }

    /**
     * Current status of the promotion related to the subscription if there is one.
     **/
    public enum Status {
        Initialized("INITIALIZED"),
        Active("ACTIVE"),
        Expired("EXPIRED"),

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
     * Current status of the promotion related to the subscription if there is one.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Current status of the promotion related to the subscription if there is one.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Whether or not customer intends to pay once the promotion is done.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    /**
     * Whether or not customer intends to pay once the promotion is done.
     * @return the value
     **/
    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /**
     * Currency unit associated with the promotion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyUnit")
    private final String currencyUnit;

    /**
     * Currency unit associated with the promotion.
     * @return the value
     **/
    public String getCurrencyUnit() {
        return currencyUnit;
    }

    /**
     * Date-time for when the promotion starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Date-time for when the promotion starts.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Date-time for when the promotion ends.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * Date-time for when the promotion ends.
     * @return the value
     **/
    public java.util.Date getTimeExpired() {
        return timeExpired;
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
        sb.append("Promotion(");
        sb.append("super=").append(super.toString());
        sb.append("duration=").append(String.valueOf(this.duration));
        sb.append(", durationUnit=").append(String.valueOf(this.durationUnit));
        sb.append(", amount=").append(String.valueOf(this.amount));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isIntentToPay=").append(String.valueOf(this.isIntentToPay));
        sb.append(", currencyUnit=").append(String.valueOf(this.currencyUnit));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Promotion)) {
            return false;
        }

        Promotion other = (Promotion) o;
        return java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.durationUnit, other.durationUnit)
                && java.util.Objects.equals(this.amount, other.amount)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isIntentToPay, other.isIntentToPay)
                && java.util.Objects.equals(this.currencyUnit, other.currencyUnit)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + (this.durationUnit == null ? 43 : this.durationUnit.hashCode());
        result = (result * PRIME) + (this.amount == null ? 43 : this.amount.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntentToPay == null ? 43 : this.isIntentToPay.hashCode());
        result = (result * PRIME) + (this.currencyUnit == null ? 43 : this.currencyUnit.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
