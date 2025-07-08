/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Health insurance card KV model sub type details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HealthInsuranceKvModelSubTypeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HealthInsuranceKvModelSubTypeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"modelSubType"})
    public HealthInsuranceKvModelSubTypeDetails(ModelSubType modelSubType) {
        super();
        this.modelSubType = modelSubType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The model sub type for KEY_VALUE_EXTRACTION The allowed values are: - {@code RECEIPT} -
         * {@code INVOICE} - {@code PASSPORT} - {@code DRIVER_LICENSE} - {@code HEALTH_INSURANCE_ID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelSubType")
        private ModelSubType modelSubType;

        /**
         * The model sub type for KEY_VALUE_EXTRACTION The allowed values are: - {@code RECEIPT} -
         * {@code INVOICE} - {@code PASSPORT} - {@code DRIVER_LICENSE} - {@code HEALTH_INSURANCE_ID}
         *
         * @param modelSubType the value to set
         * @return this builder
         */
        public Builder modelSubType(ModelSubType modelSubType) {
            this.modelSubType = modelSubType;
            this.__explicitlySet__.add("modelSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthInsuranceKvModelSubTypeDetails build() {
            HealthInsuranceKvModelSubTypeDetails model =
                    new HealthInsuranceKvModelSubTypeDetails(this.modelSubType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthInsuranceKvModelSubTypeDetails model) {
            if (model.wasPropertyExplicitlySet("modelSubType")) {
                this.modelSubType(model.getModelSubType());
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
     * The model sub type for KEY_VALUE_EXTRACTION The allowed values are: - {@code RECEIPT} -
     * {@code INVOICE} - {@code PASSPORT} - {@code DRIVER_LICENSE} - {@code HEALTH_INSURANCE_ID}
     */
    public enum ModelSubType implements com.oracle.bmc.http.internal.BmcEnum {
        Receipt("RECEIPT"),
        Invoice("INVOICE"),
        Passport("PASSPORT"),
        DriverLicense("DRIVER_LICENSE"),
        HealthInsuranceId("HEALTH_INSURANCE_ID"),
        ;

        private final String value;
        private static java.util.Map<String, ModelSubType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelSubType v : ModelSubType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelSubType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelSubType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelSubType: " + key);
        }
    };
    /**
     * The model sub type for KEY_VALUE_EXTRACTION The allowed values are: - {@code RECEIPT} -
     * {@code INVOICE} - {@code PASSPORT} - {@code DRIVER_LICENSE} - {@code HEALTH_INSURANCE_ID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelSubType")
    private final ModelSubType modelSubType;

    /**
     * The model sub type for KEY_VALUE_EXTRACTION The allowed values are: - {@code RECEIPT} -
     * {@code INVOICE} - {@code PASSPORT} - {@code DRIVER_LICENSE} - {@code HEALTH_INSURANCE_ID}
     *
     * @return the value
     */
    public ModelSubType getModelSubType() {
        return modelSubType;
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
        sb.append("HealthInsuranceKvModelSubTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("modelSubType=").append(String.valueOf(this.modelSubType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthInsuranceKvModelSubTypeDetails)) {
            return false;
        }

        HealthInsuranceKvModelSubTypeDetails other = (HealthInsuranceKvModelSubTypeDetails) o;
        return java.util.Objects.equals(this.modelSubType, other.modelSubType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelSubType == null ? 43 : this.modelSubType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
