/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Currency details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OrgnizationSubsCurrency.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OrgnizationSubsCurrency {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "isoCode", "stdPrecision"})
    public OrgnizationSubsCurrency(String name, String isoCode, Long stdPrecision) {
        super();
        this.name = name;
        this.isoCode = isoCode;
        this.stdPrecision = stdPrecision;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Currency name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Currency name
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Currency Code
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isoCode")
        private String isoCode;

        /**
         * Currency Code
         *
         * @param isoCode the value to set
         * @return this builder
         **/
        public Builder isoCode(String isoCode) {
            this.isoCode = isoCode;
            this.__explicitlySet__.add("isoCode");
            return this;
        }
        /**
         * Standard Precision of the Currency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stdPrecision")
        private Long stdPrecision;

        /**
         * Standard Precision of the Currency
         *
         * @param stdPrecision the value to set
         * @return this builder
         **/
        public Builder stdPrecision(Long stdPrecision) {
            this.stdPrecision = stdPrecision;
            this.__explicitlySet__.add("stdPrecision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrgnizationSubsCurrency build() {
            OrgnizationSubsCurrency __instance__ =
                    new OrgnizationSubsCurrency(name, isoCode, stdPrecision);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrgnizationSubsCurrency o) {
            Builder copiedBuilder =
                    name(o.getName()).isoCode(o.getIsoCode()).stdPrecision(o.getStdPrecision());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Currency name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Currency name
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Currency Code
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isoCode")
    private final String isoCode;

    /**
     * Currency Code
     *
     * @return the value
     **/
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Standard Precision of the Currency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stdPrecision")
    private final Long stdPrecision;

    /**
     * Standard Precision of the Currency
     *
     * @return the value
     **/
    public Long getStdPrecision() {
        return stdPrecision;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OrgnizationSubsCurrency(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isoCode=").append(String.valueOf(this.isoCode));
        sb.append(", stdPrecision=").append(String.valueOf(this.stdPrecision));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrgnizationSubsCurrency)) {
            return false;
        }

        OrgnizationSubsCurrency other = (OrgnizationSubsCurrency) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isoCode, other.isoCode)
                && java.util.Objects.equals(this.stdPrecision, other.stdPrecision)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isoCode == null ? 43 : this.isoCode.hashCode());
        result = (result * PRIME) + (this.stdPrecision == null ? 43 : this.stdPrecision.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
