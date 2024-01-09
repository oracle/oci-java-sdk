/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of EnvironmentLimits. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FusionEnvironmentFamilyLimitsAndUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FusionEnvironmentFamilyLimitsAndUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
            FusionEnvironmentFamilyLimitsAndUsage model =
                    new FusionEnvironmentFamilyLimitsAndUsage(
                            this.productionLimitAndUsage,
                            this.testLimitAndUsage,
                            this.developmentLimitAndUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FusionEnvironmentFamilyLimitsAndUsage model) {
            if (model.wasPropertyExplicitlySet("productionLimitAndUsage")) {
                this.productionLimitAndUsage(model.getProductionLimitAndUsage());
            }
            if (model.wasPropertyExplicitlySet("testLimitAndUsage")) {
                this.testLimitAndUsage(model.getTestLimitAndUsage());
            }
            if (model.wasPropertyExplicitlySet("developmentLimitAndUsage")) {
                this.developmentLimitAndUsage(model.getDevelopmentLimitAndUsage());
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FusionEnvironmentFamilyLimitsAndUsage(");
        sb.append("super=").append(super.toString());
        sb.append("productionLimitAndUsage=").append(String.valueOf(this.productionLimitAndUsage));
        sb.append(", testLimitAndUsage=").append(String.valueOf(this.testLimitAndUsage));
        sb.append(", developmentLimitAndUsage=")
                .append(String.valueOf(this.developmentLimitAndUsage));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
