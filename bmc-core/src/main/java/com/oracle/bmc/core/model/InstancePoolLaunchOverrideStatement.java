/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * One availability domain-scoped rule inside an instance pool launch override policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolLaunchOverrideStatement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolLaunchOverrideStatement
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "selector", "overrideOptions"})
    public InstancePoolLaunchOverrideStatement(
            String name,
            InstancePoolLaunchOverrideSelector selector,
            java.util.List<InstancePoolLaunchOverrideOption> overrideOptions) {
        super();
        this.name = name;
        this.selector = selector;
        this.overrideOptions = overrideOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user-friendly name for the override statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the override statement.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("selector")
        private InstancePoolLaunchOverrideSelector selector;

        public Builder selector(InstancePoolLaunchOverrideSelector selector) {
            this.selector = selector;
            this.__explicitlySet__.add("selector");
            return this;
        }
        /**
         * The ordered list of candidate override options for the matched availability domain.
         *
         * <p>Request order defines the canonical candidate sequence. Override options within the
         * same statement must normalize to distinct override payloads.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overrideOptions")
        private java.util.List<InstancePoolLaunchOverrideOption> overrideOptions;

        /**
         * The ordered list of candidate override options for the matched availability domain.
         *
         * <p>Request order defines the canonical candidate sequence. Override options within the
         * same statement must normalize to distinct override payloads.
         *
         * @param overrideOptions the value to set
         * @return this builder
         */
        public Builder overrideOptions(
                java.util.List<InstancePoolLaunchOverrideOption> overrideOptions) {
            this.overrideOptions = overrideOptions;
            this.__explicitlySet__.add("overrideOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolLaunchOverrideStatement build() {
            InstancePoolLaunchOverrideStatement model =
                    new InstancePoolLaunchOverrideStatement(
                            this.name, this.selector, this.overrideOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolLaunchOverrideStatement model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("selector")) {
                this.selector(model.getSelector());
            }
            if (model.wasPropertyExplicitlySet("overrideOptions")) {
                this.overrideOptions(model.getOverrideOptions());
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

    /** A user-friendly name for the override statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the override statement.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    private final InstancePoolLaunchOverrideSelector selector;

    public InstancePoolLaunchOverrideSelector getSelector() {
        return selector;
    }

    /**
     * The ordered list of candidate override options for the matched availability domain.
     *
     * <p>Request order defines the canonical candidate sequence. Override options within the same
     * statement must normalize to distinct override payloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrideOptions")
    private final java.util.List<InstancePoolLaunchOverrideOption> overrideOptions;

    /**
     * The ordered list of candidate override options for the matched availability domain.
     *
     * <p>Request order defines the canonical candidate sequence. Override options within the same
     * statement must normalize to distinct override payloads.
     *
     * @return the value
     */
    public java.util.List<InstancePoolLaunchOverrideOption> getOverrideOptions() {
        return overrideOptions;
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
        sb.append("InstancePoolLaunchOverrideStatement(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", selector=").append(String.valueOf(this.selector));
        sb.append(", overrideOptions=").append(String.valueOf(this.overrideOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolLaunchOverrideStatement)) {
            return false;
        }

        InstancePoolLaunchOverrideStatement other = (InstancePoolLaunchOverrideStatement) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.selector, other.selector)
                && java.util.Objects.equals(this.overrideOptions, other.overrideOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.selector == null ? 43 : this.selector.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideOptions == null ? 43 : this.overrideOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
