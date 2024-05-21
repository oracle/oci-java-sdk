/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the strategy. The strategy is the method used to apply the recommendation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Strategy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Strategy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"strategyName", "isDefault", "parametersDefinition"})
    public Strategy(
            String strategyName,
            Boolean isDefault,
            java.util.List<StrategyParameter> parametersDefinition) {
        super();
        this.strategyName = strategyName;
        this.isDefault = isDefault;
        this.parametersDefinition = parametersDefinition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the strategy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
        private String strategyName;

        /**
         * The name of the strategy.
         * @param strategyName the value to set
         * @return this builder
         **/
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            this.__explicitlySet__.add("strategyName");
            return this;
        }
        /**
         * Whether this is the default recommendation strategy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Whether this is the default recommendation strategy.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * The list of strategies for the parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parametersDefinition")
        private java.util.List<StrategyParameter> parametersDefinition;

        /**
         * The list of strategies for the parameters.
         * @param parametersDefinition the value to set
         * @return this builder
         **/
        public Builder parametersDefinition(
                java.util.List<StrategyParameter> parametersDefinition) {
            this.parametersDefinition = parametersDefinition;
            this.__explicitlySet__.add("parametersDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Strategy build() {
            Strategy model =
                    new Strategy(this.strategyName, this.isDefault, this.parametersDefinition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Strategy model) {
            if (model.wasPropertyExplicitlySet("strategyName")) {
                this.strategyName(model.getStrategyName());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("parametersDefinition")) {
                this.parametersDefinition(model.getParametersDefinition());
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
     * The name of the strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
    private final String strategyName;

    /**
     * The name of the strategy.
     * @return the value
     **/
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Whether this is the default recommendation strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Whether this is the default recommendation strategy.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The list of strategies for the parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersDefinition")
    private final java.util.List<StrategyParameter> parametersDefinition;

    /**
     * The list of strategies for the parameters.
     * @return the value
     **/
    public java.util.List<StrategyParameter> getParametersDefinition() {
        return parametersDefinition;
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
        sb.append("Strategy(");
        sb.append("super=").append(super.toString());
        sb.append("strategyName=").append(String.valueOf(this.strategyName));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", parametersDefinition=").append(String.valueOf(this.parametersDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Strategy)) {
            return false;
        }

        Strategy other = (Strategy) o;
        return java.util.Objects.equals(this.strategyName, other.strategyName)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.parametersDefinition, other.parametersDefinition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.strategyName == null ? 43 : this.strategyName.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersDefinition == null
                                ? 43
                                : this.parametersDefinition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
