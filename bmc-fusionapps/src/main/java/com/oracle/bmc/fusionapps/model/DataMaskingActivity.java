/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of data masking activity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataMaskingActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataMaskingActivity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "fusionEnvironmentId",
        "lifecycleState",
        "timeMaskingStart",
        "timeMaskingFinish"
    })
    public DataMaskingActivity(
            String id,
            String fusionEnvironmentId,
            LifecycleState lifecycleState,
            java.util.Date timeMaskingStart,
            java.util.Date timeMaskingFinish) {
        super();
        this.id = id;
        this.fusionEnvironmentId = fusionEnvironmentId;
        this.lifecycleState = lifecycleState;
        this.timeMaskingStart = timeMaskingStart;
        this.timeMaskingFinish = timeMaskingFinish;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Fusion Environment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
        private String fusionEnvironmentId;

        /**
         * Fusion Environment Identifier.
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            this.__explicitlySet__.add("fusionEnvironmentId");
            return this;
        }
        /** The current state of the DataMaskingActivity. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the DataMaskingActivity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The time the data masking activity started. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStart")
        private java.util.Date timeMaskingStart;

        /**
         * The time the data masking activity started. An RFC3339 formatted datetime string.
         *
         * @param timeMaskingStart the value to set
         * @return this builder
         */
        public Builder timeMaskingStart(java.util.Date timeMaskingStart) {
            this.timeMaskingStart = timeMaskingStart;
            this.__explicitlySet__.add("timeMaskingStart");
            return this;
        }
        /** The time the data masking activity ended. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinish")
        private java.util.Date timeMaskingFinish;

        /**
         * The time the data masking activity ended. An RFC3339 formatted datetime string.
         *
         * @param timeMaskingFinish the value to set
         * @return this builder
         */
        public Builder timeMaskingFinish(java.util.Date timeMaskingFinish) {
            this.timeMaskingFinish = timeMaskingFinish;
            this.__explicitlySet__.add("timeMaskingFinish");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataMaskingActivity build() {
            DataMaskingActivity model =
                    new DataMaskingActivity(
                            this.id,
                            this.fusionEnvironmentId,
                            this.lifecycleState,
                            this.timeMaskingStart,
                            this.timeMaskingFinish);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataMaskingActivity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentId")) {
                this.fusionEnvironmentId(model.getFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingStart")) {
                this.timeMaskingStart(model.getTimeMaskingStart());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingFinish")) {
                this.timeMaskingFinish(model.getTimeMaskingFinish());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Fusion Environment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentId")
    private final String fusionEnvironmentId;

    /**
     * Fusion Environment Identifier.
     *
     * @return the value
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }

    /** The current state of the DataMaskingActivity. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceled("CANCELED"),

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
    /** The current state of the DataMaskingActivity. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the DataMaskingActivity.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The time the data masking activity started. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStart")
    private final java.util.Date timeMaskingStart;

    /**
     * The time the data masking activity started. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeMaskingStart() {
        return timeMaskingStart;
    }

    /** The time the data masking activity ended. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinish")
    private final java.util.Date timeMaskingFinish;

    /**
     * The time the data masking activity ended. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeMaskingFinish() {
        return timeMaskingFinish;
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
        sb.append("DataMaskingActivity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeMaskingStart=").append(String.valueOf(this.timeMaskingStart));
        sb.append(", timeMaskingFinish=").append(String.valueOf(this.timeMaskingFinish));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataMaskingActivity)) {
            return false;
        }

        DataMaskingActivity other = (DataMaskingActivity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeMaskingStart, other.timeMaskingStart)
                && java.util.Objects.equals(this.timeMaskingFinish, other.timeMaskingFinish)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingStart == null ? 43 : this.timeMaskingStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingFinish == null ? 43 : this.timeMaskingFinish.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
