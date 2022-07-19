/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of EnvironmentLimits.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FusionEnvironmentFamilyLimitsAndUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FusionEnvironmentFamilyLimitsAndUsage {
    @Deprecated
    @java.beans.ConstructorProperties({
        "productionLimitAndUsage",
        "testLimitAndUsage",
        "developmentLimitAndUsage"
    })
    public FusionEnvironmentFamilyLimitsAndUsage(
            LimitAndUsage productionLimitAndUsage,
            LimitAndUsage testLimitAndUsage,
            LimitAndUsage developmentLimitAndUsage) {
        super();
        this.productionLimitAndUsage = productionLimitAndUsage;
        this.testLimitAndUsage = testLimitAndUsage;
        this.developmentLimitAndUsage = developmentLimitAndUsage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("productionLimitAndUsage")
        private LimitAndUsage productionLimitAndUsage;

        public Builder productionLimitAndUsage(LimitAndUsage productionLimitAndUsage) {
            this.productionLimitAndUsage = productionLimitAndUsage;
            this.__explicitlySet__.add("productionLimitAndUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testLimitAndUsage")
        private LimitAndUsage testLimitAndUsage;

        public Builder testLimitAndUsage(LimitAndUsage testLimitAndUsage) {
            this.testLimitAndUsage = testLimitAndUsage;
            this.__explicitlySet__.add("testLimitAndUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("developmentLimitAndUsage")
        private LimitAndUsage developmentLimitAndUsage;

        public Builder developmentLimitAndUsage(LimitAndUsage developmentLimitAndUsage) {
            this.developmentLimitAndUsage = developmentLimitAndUsage;
            this.__explicitlySet__.add("developmentLimitAndUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FusionEnvironmentFamilyLimitsAndUsage build() {
            FusionEnvironmentFamilyLimitsAndUsage __instance__ =
                    new FusionEnvironmentFamilyLimitsAndUsage(
                            productionLimitAndUsage, testLimitAndUsage, developmentLimitAndUsage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FusionEnvironmentFamilyLimitsAndUsage o) {
            Builder copiedBuilder =
                    productionLimitAndUsage(o.getProductionLimitAndUsage())
                            .testLimitAndUsage(o.getTestLimitAndUsage())
                            .developmentLimitAndUsage(o.getDevelopmentLimitAndUsage());

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

    @com.fasterxml.jackson.annotation.JsonProperty("productionLimitAndUsage")
    private final LimitAndUsage productionLimitAndUsage;

    public LimitAndUsage getProductionLimitAndUsage() {
        return productionLimitAndUsage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("testLimitAndUsage")
    private final LimitAndUsage testLimitAndUsage;

    public LimitAndUsage getTestLimitAndUsage() {
        return testLimitAndUsage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("developmentLimitAndUsage")
    private final LimitAndUsage developmentLimitAndUsage;

    public LimitAndUsage getDevelopmentLimitAndUsage() {
        return developmentLimitAndUsage;
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
        sb.append("FusionEnvironmentFamilyLimitsAndUsage(");
        sb.append("productionLimitAndUsage=").append(String.valueOf(this.productionLimitAndUsage));
        sb.append(", testLimitAndUsage=").append(String.valueOf(this.testLimitAndUsage));
        sb.append(", developmentLimitAndUsage=")
                .append(String.valueOf(this.developmentLimitAndUsage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FusionEnvironmentFamilyLimitsAndUsage)) {
            return false;
        }

        FusionEnvironmentFamilyLimitsAndUsage other = (FusionEnvironmentFamilyLimitsAndUsage) o;
        return java.util.Objects.equals(this.productionLimitAndUsage, other.productionLimitAndUsage)
                && java.util.Objects.equals(this.testLimitAndUsage, other.testLimitAndUsage)
                && java.util.Objects.equals(
                        this.developmentLimitAndUsage, other.developmentLimitAndUsage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.productionLimitAndUsage == null
                                ? 43
                                : this.productionLimitAndUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.testLimitAndUsage == null ? 43 : this.testLimitAndUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.developmentLimitAndUsage == null
                                ? 43
                                : this.developmentLimitAndUsage.hashCode());
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
