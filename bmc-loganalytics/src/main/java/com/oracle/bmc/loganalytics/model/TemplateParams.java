/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Template key value params which can store template details like macro name and its parameter.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TemplateParams.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TemplateParams
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keyField", "valueField"})
    public TemplateParams(String keyField, String valueField) {
        super();
        this.keyField = keyField;
        this.valueField = valueField;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Contains macro parameter's names. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyField")
        private String keyField;

        /**
         * Contains macro parameter's names.
         *
         * @param keyField the value to set
         * @return this builder
         */
        public Builder keyField(String keyField) {
            this.keyField = keyField;
            this.__explicitlySet__.add("keyField");
            return this;
        }
        /** Contains macro parameter's value. */
        @com.fasterxml.jackson.annotation.JsonProperty("valueField")
        private String valueField;

        /**
         * Contains macro parameter's value.
         *
         * @param valueField the value to set
         * @return this builder
         */
        public Builder valueField(String valueField) {
            this.valueField = valueField;
            this.__explicitlySet__.add("valueField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TemplateParams build() {
            TemplateParams model = new TemplateParams(this.keyField, this.valueField);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TemplateParams model) {
            if (model.wasPropertyExplicitlySet("keyField")) {
                this.keyField(model.getKeyField());
            }
            if (model.wasPropertyExplicitlySet("valueField")) {
                this.valueField(model.getValueField());
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

    /** Contains macro parameter's names. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyField")
    private final String keyField;

    /**
     * Contains macro parameter's names.
     *
     * @return the value
     */
    public String getKeyField() {
        return keyField;
    }

    /** Contains macro parameter's value. */
    @com.fasterxml.jackson.annotation.JsonProperty("valueField")
    private final String valueField;

    /**
     * Contains macro parameter's value.
     *
     * @return the value
     */
    public String getValueField() {
        return valueField;
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
        sb.append("TemplateParams(");
        sb.append("super=").append(super.toString());
        sb.append("keyField=").append(String.valueOf(this.keyField));
        sb.append(", valueField=").append(String.valueOf(this.valueField));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TemplateParams)) {
            return false;
        }

        TemplateParams other = (TemplateParams) o;
        return java.util.Objects.equals(this.keyField, other.keyField)
                && java.util.Objects.equals(this.valueField, other.valueField)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyField == null ? 43 : this.keyField.hashCode());
        result = (result * PRIME) + (this.valueField == null ? 43 : this.valueField.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
