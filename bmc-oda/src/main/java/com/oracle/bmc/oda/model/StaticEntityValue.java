/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Value in a static entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StaticEntityValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StaticEntityValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"canonicalName", "naturalLanguageMapping"})
    public StaticEntityValue(
            String canonicalName, StaticEntityValueNaturalLanguageMapping naturalLanguageMapping) {
        super();
        this.canonicalName = canonicalName;
        this.naturalLanguageMapping = naturalLanguageMapping;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Value for a static entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalName")
        private String canonicalName;

        /**
         * Value for a static entity.
         *
         * @param canonicalName the value to set
         * @return this builder
         */
        public Builder canonicalName(String canonicalName) {
            this.canonicalName = canonicalName;
            this.__explicitlySet__.add("canonicalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
        private StaticEntityValueNaturalLanguageMapping naturalLanguageMapping;

        public Builder naturalLanguageMapping(
                StaticEntityValueNaturalLanguageMapping naturalLanguageMapping) {
            this.naturalLanguageMapping = naturalLanguageMapping;
            this.__explicitlySet__.add("naturalLanguageMapping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StaticEntityValue build() {
            StaticEntityValue model =
                    new StaticEntityValue(this.canonicalName, this.naturalLanguageMapping);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StaticEntityValue model) {
            if (model.wasPropertyExplicitlySet("canonicalName")) {
                this.canonicalName(model.getCanonicalName());
            }
            if (model.wasPropertyExplicitlySet("naturalLanguageMapping")) {
                this.naturalLanguageMapping(model.getNaturalLanguageMapping());
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

    /** Value for a static entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalName")
    private final String canonicalName;

    /**
     * Value for a static entity.
     *
     * @return the value
     */
    public String getCanonicalName() {
        return canonicalName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
    private final StaticEntityValueNaturalLanguageMapping naturalLanguageMapping;

    public StaticEntityValueNaturalLanguageMapping getNaturalLanguageMapping() {
        return naturalLanguageMapping;
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
        sb.append("StaticEntityValue(");
        sb.append("super=").append(super.toString());
        sb.append("canonicalName=").append(String.valueOf(this.canonicalName));
        sb.append(", naturalLanguageMapping=").append(String.valueOf(this.naturalLanguageMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StaticEntityValue)) {
            return false;
        }

        StaticEntityValue other = (StaticEntityValue) o;
        return java.util.Objects.equals(this.canonicalName, other.canonicalName)
                && java.util.Objects.equals(
                        this.naturalLanguageMapping, other.naturalLanguageMapping)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canonicalName == null ? 43 : this.canonicalName.hashCode());
        result =
                (result * PRIME)
                        + (this.naturalLanguageMapping == null
                                ? 43
                                : this.naturalLanguageMapping.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
