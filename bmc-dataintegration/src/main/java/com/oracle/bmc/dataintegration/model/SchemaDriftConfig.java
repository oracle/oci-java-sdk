/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The configuration for handling schema drift in a Source or Target operator. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SchemaDriftConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SchemaDriftConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "extraColumnHandling",
        "missingColumnHandling",
        "dataTypeChangeHandling",
        "isValidationWarningIfAllowed"
    })
    public SchemaDriftConfig(
            ExtraColumnHandling extraColumnHandling,
            MissingColumnHandling missingColumnHandling,
            DataTypeChangeHandling dataTypeChangeHandling,
            Boolean isValidationWarningIfAllowed) {
        super();
        this.extraColumnHandling = extraColumnHandling;
        this.missingColumnHandling = missingColumnHandling;
        this.dataTypeChangeHandling = dataTypeChangeHandling;
        this.isValidationWarningIfAllowed = isValidationWarningIfAllowed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The setting for how to handle extra columns/fields. NULL_FILLUP means that nulls will be
         * loaded into the target for extra columns.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extraColumnHandling")
        private ExtraColumnHandling extraColumnHandling;

        /**
         * The setting for how to handle extra columns/fields. NULL_FILLUP means that nulls will be
         * loaded into the target for extra columns.
         *
         * @param extraColumnHandling the value to set
         * @return this builder
         */
        public Builder extraColumnHandling(ExtraColumnHandling extraColumnHandling) {
            this.extraColumnHandling = extraColumnHandling;
            this.__explicitlySet__.add("extraColumnHandling");
            return this;
        }
        /**
         * The setting for how to handle missing columns/fields. NULL_SELECT means that null values
         * will be selected from the source for missing columns.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("missingColumnHandling")
        private MissingColumnHandling missingColumnHandling;

        /**
         * The setting for how to handle missing columns/fields. NULL_SELECT means that null values
         * will be selected from the source for missing columns.
         *
         * @param missingColumnHandling the value to set
         * @return this builder
         */
        public Builder missingColumnHandling(MissingColumnHandling missingColumnHandling) {
            this.missingColumnHandling = missingColumnHandling;
            this.__explicitlySet__.add("missingColumnHandling");
            return this;
        }
        /** The setting for how to handle columns/fields with changed data types. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeChangeHandling")
        private DataTypeChangeHandling dataTypeChangeHandling;

        /**
         * The setting for how to handle columns/fields with changed data types.
         *
         * @param dataTypeChangeHandling the value to set
         * @return this builder
         */
        public Builder dataTypeChangeHandling(DataTypeChangeHandling dataTypeChangeHandling) {
            this.dataTypeChangeHandling = dataTypeChangeHandling;
            this.__explicitlySet__.add("dataTypeChangeHandling");
            return this;
        }
        /** If true, display a validation warning for schema changes, even if they are allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isValidationWarningIfAllowed")
        private Boolean isValidationWarningIfAllowed;

        /**
         * If true, display a validation warning for schema changes, even if they are allowed.
         *
         * @param isValidationWarningIfAllowed the value to set
         * @return this builder
         */
        public Builder isValidationWarningIfAllowed(Boolean isValidationWarningIfAllowed) {
            this.isValidationWarningIfAllowed = isValidationWarningIfAllowed;
            this.__explicitlySet__.add("isValidationWarningIfAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaDriftConfig build() {
            SchemaDriftConfig model =
                    new SchemaDriftConfig(
                            this.extraColumnHandling,
                            this.missingColumnHandling,
                            this.dataTypeChangeHandling,
                            this.isValidationWarningIfAllowed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaDriftConfig model) {
            if (model.wasPropertyExplicitlySet("extraColumnHandling")) {
                this.extraColumnHandling(model.getExtraColumnHandling());
            }
            if (model.wasPropertyExplicitlySet("missingColumnHandling")) {
                this.missingColumnHandling(model.getMissingColumnHandling());
            }
            if (model.wasPropertyExplicitlySet("dataTypeChangeHandling")) {
                this.dataTypeChangeHandling(model.getDataTypeChangeHandling());
            }
            if (model.wasPropertyExplicitlySet("isValidationWarningIfAllowed")) {
                this.isValidationWarningIfAllowed(model.getIsValidationWarningIfAllowed());
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

    /**
     * The setting for how to handle extra columns/fields. NULL_FILLUP means that nulls will be
     * loaded into the target for extra columns.
     */
    public enum ExtraColumnHandling implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
        NullFillup("NULL_FILLUP"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExtraColumnHandling.class);

        private final String value;
        private static java.util.Map<String, ExtraColumnHandling> map;

        static {
            map = new java.util.HashMap<>();
            for (ExtraColumnHandling v : ExtraColumnHandling.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExtraColumnHandling(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExtraColumnHandling create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExtraColumnHandling', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The setting for how to handle extra columns/fields. NULL_FILLUP means that nulls will be
     * loaded into the target for extra columns.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraColumnHandling")
    private final ExtraColumnHandling extraColumnHandling;

    /**
     * The setting for how to handle extra columns/fields. NULL_FILLUP means that nulls will be
     * loaded into the target for extra columns.
     *
     * @return the value
     */
    public ExtraColumnHandling getExtraColumnHandling() {
        return extraColumnHandling;
    }

    /**
     * The setting for how to handle missing columns/fields. NULL_SELECT means that null values will
     * be selected from the source for missing columns.
     */
    public enum MissingColumnHandling implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
        NullSelect("NULL_SELECT"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MissingColumnHandling.class);

        private final String value;
        private static java.util.Map<String, MissingColumnHandling> map;

        static {
            map = new java.util.HashMap<>();
            for (MissingColumnHandling v : MissingColumnHandling.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MissingColumnHandling(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MissingColumnHandling create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MissingColumnHandling', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The setting for how to handle missing columns/fields. NULL_SELECT means that null values will
     * be selected from the source for missing columns.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("missingColumnHandling")
    private final MissingColumnHandling missingColumnHandling;

    /**
     * The setting for how to handle missing columns/fields. NULL_SELECT means that null values will
     * be selected from the source for missing columns.
     *
     * @return the value
     */
    public MissingColumnHandling getMissingColumnHandling() {
        return missingColumnHandling;
    }

    /** The setting for how to handle columns/fields with changed data types. */
    public enum DataTypeChangeHandling implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
        DoCastIfPossible("DO_CAST_IF_POSSIBLE"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataTypeChangeHandling.class);

        private final String value;
        private static java.util.Map<String, DataTypeChangeHandling> map;

        static {
            map = new java.util.HashMap<>();
            for (DataTypeChangeHandling v : DataTypeChangeHandling.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataTypeChangeHandling(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataTypeChangeHandling create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataTypeChangeHandling', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The setting for how to handle columns/fields with changed data types. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeChangeHandling")
    private final DataTypeChangeHandling dataTypeChangeHandling;

    /**
     * The setting for how to handle columns/fields with changed data types.
     *
     * @return the value
     */
    public DataTypeChangeHandling getDataTypeChangeHandling() {
        return dataTypeChangeHandling;
    }

    /** If true, display a validation warning for schema changes, even if they are allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isValidationWarningIfAllowed")
    private final Boolean isValidationWarningIfAllowed;

    /**
     * If true, display a validation warning for schema changes, even if they are allowed.
     *
     * @return the value
     */
    public Boolean getIsValidationWarningIfAllowed() {
        return isValidationWarningIfAllowed;
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
        sb.append("SchemaDriftConfig(");
        sb.append("super=").append(super.toString());
        sb.append("extraColumnHandling=").append(String.valueOf(this.extraColumnHandling));
        sb.append(", missingColumnHandling=").append(String.valueOf(this.missingColumnHandling));
        sb.append(", dataTypeChangeHandling=").append(String.valueOf(this.dataTypeChangeHandling));
        sb.append(", isValidationWarningIfAllowed=")
                .append(String.valueOf(this.isValidationWarningIfAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaDriftConfig)) {
            return false;
        }

        SchemaDriftConfig other = (SchemaDriftConfig) o;
        return java.util.Objects.equals(this.extraColumnHandling, other.extraColumnHandling)
                && java.util.Objects.equals(this.missingColumnHandling, other.missingColumnHandling)
                && java.util.Objects.equals(
                        this.dataTypeChangeHandling, other.dataTypeChangeHandling)
                && java.util.Objects.equals(
                        this.isValidationWarningIfAllowed, other.isValidationWarningIfAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.extraColumnHandling == null
                                ? 43
                                : this.extraColumnHandling.hashCode());
        result =
                (result * PRIME)
                        + (this.missingColumnHandling == null
                                ? 43
                                : this.missingColumnHandling.hashCode());
        result =
                (result * PRIME)
                        + (this.dataTypeChangeHandling == null
                                ? 43
                                : this.dataTypeChangeHandling.hashCode());
        result =
                (result * PRIME)
                        + (this.isValidationWarningIfAllowed == null
                                ? 43
                                : this.isValidationWarningIfAllowed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
