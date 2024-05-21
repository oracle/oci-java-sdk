/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging grep filter object greps events by the values of specified fields.
 * Ref: https://docs.fluentd.org/filter/grep
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentLoggingGrepFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "filterType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentLoggingGrepFilter extends UnifiedAgentLoggingFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A list of filtering rules to include logs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowList")
        private java.util.List<GrepFilterAllowRule> allowList;

        /**
         * A list of filtering rules to include logs
         * @param allowList the value to set
         * @return this builder
         **/
        public Builder allowList(java.util.List<GrepFilterAllowRule> allowList) {
            this.allowList = allowList;
            this.__explicitlySet__.add("allowList");
            return this;
        }
        /**
         * A list of filtering rules to reject logs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("denyList")
        private java.util.List<GrepFilterDenyRule> denyList;

        /**
         * A list of filtering rules to reject logs
         * @param denyList the value to set
         * @return this builder
         **/
        public Builder denyList(java.util.List<GrepFilterDenyRule> denyList) {
            this.denyList = denyList;
            this.__explicitlySet__.add("denyList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentLoggingGrepFilter build() {
            UnifiedAgentLoggingGrepFilter model =
                    new UnifiedAgentLoggingGrepFilter(this.name, this.allowList, this.denyList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentLoggingGrepFilter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("allowList")) {
                this.allowList(model.getAllowList());
            }
            if (model.wasPropertyExplicitlySet("denyList")) {
                this.denyList(model.getDenyList());
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

    @Deprecated
    public UnifiedAgentLoggingGrepFilter(
            String name,
            java.util.List<GrepFilterAllowRule> allowList,
            java.util.List<GrepFilterDenyRule> denyList) {
        super(name);
        this.allowList = allowList;
        this.denyList = denyList;
    }

    /**
     * A list of filtering rules to include logs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowList")
    private final java.util.List<GrepFilterAllowRule> allowList;

    /**
     * A list of filtering rules to include logs
     * @return the value
     **/
    public java.util.List<GrepFilterAllowRule> getAllowList() {
        return allowList;
    }

    /**
     * A list of filtering rules to reject logs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("denyList")
    private final java.util.List<GrepFilterDenyRule> denyList;

    /**
     * A list of filtering rules to reject logs
     * @return the value
     **/
    public java.util.List<GrepFilterDenyRule> getDenyList() {
        return denyList;
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
        sb.append("UnifiedAgentLoggingGrepFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", allowList=").append(String.valueOf(this.allowList));
        sb.append(", denyList=").append(String.valueOf(this.denyList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentLoggingGrepFilter)) {
            return false;
        }

        UnifiedAgentLoggingGrepFilter other = (UnifiedAgentLoggingGrepFilter) o;
        return java.util.Objects.equals(this.allowList, other.allowList)
                && java.util.Objects.equals(this.denyList, other.denyList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.allowList == null ? 43 : this.allowList.hashCode());
        result = (result * PRIME) + (this.denyList == null ? 43 : this.denyList.hashCode());
        return result;
    }
}
