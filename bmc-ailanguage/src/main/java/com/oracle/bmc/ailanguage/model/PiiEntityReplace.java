/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Replace PII entities with a given sequence of characters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PiiEntityReplace.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "mode")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PiiEntityReplace extends PiiEntityMasking {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exclude")
        private java.util.List<String> exclude;

        public Builder exclude(java.util.List<String> exclude) {
            this.exclude = exclude;
            this.__explicitlySet__.add("exclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shouldDetect")
        private Boolean shouldDetect;

        public Builder shouldDetect(Boolean shouldDetect) {
            this.shouldDetect = shouldDetect;
            this.__explicitlySet__.add("shouldDetect");
            return this;
        }
        /**
         * Replace entities with given sequence of characters. By default PII entity will be
         * replaced with <ENTITY_TYPE>.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replaceWith")
        private String replaceWith;

        /**
         * Replace entities with given sequence of characters. By default PII entity will be
         * replaced with <ENTITY_TYPE>.
         *
         * @param replaceWith the value to set
         * @return this builder
         */
        public Builder replaceWith(String replaceWith) {
            this.replaceWith = replaceWith;
            this.__explicitlySet__.add("replaceWith");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PiiEntityReplace build() {
            PiiEntityReplace model =
                    new PiiEntityReplace(this.exclude, this.shouldDetect, this.replaceWith);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PiiEntityReplace model) {
            if (model.wasPropertyExplicitlySet("exclude")) {
                this.exclude(model.getExclude());
            }
            if (model.wasPropertyExplicitlySet("shouldDetect")) {
                this.shouldDetect(model.getShouldDetect());
            }
            if (model.wasPropertyExplicitlySet("replaceWith")) {
                this.replaceWith(model.getReplaceWith());
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

    @Deprecated
    public PiiEntityReplace(
            java.util.List<String> exclude, Boolean shouldDetect, String replaceWith) {
        super(exclude, shouldDetect);
        this.replaceWith = replaceWith;
    }

    /**
     * Replace entities with given sequence of characters. By default PII entity will be replaced
     * with <ENTITY_TYPE>.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaceWith")
    private final String replaceWith;

    /**
     * Replace entities with given sequence of characters. By default PII entity will be replaced
     * with <ENTITY_TYPE>.
     *
     * @return the value
     */
    public String getReplaceWith() {
        return replaceWith;
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
        sb.append("PiiEntityReplace(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", replaceWith=").append(String.valueOf(this.replaceWith));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiEntityReplace)) {
            return false;
        }

        PiiEntityReplace other = (PiiEntityReplace) o;
        return java.util.Objects.equals(this.replaceWith, other.replaceWith) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.replaceWith == null ? 43 : this.replaceWith.hashCode());
        return result;
    }
}
