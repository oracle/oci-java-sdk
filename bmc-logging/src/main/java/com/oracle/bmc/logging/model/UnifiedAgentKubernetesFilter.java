/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Kubernetes filter object <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentKubernetesFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "filterType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentKubernetesFilter extends UnifiedAgentMonitoringFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** List of metrics regex to be allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowList")
        private java.util.List<String> allowList;

        /**
         * List of metrics regex to be allowed.
         *
         * @param allowList the value to set
         * @return this builder
         */
        public Builder allowList(java.util.List<String> allowList) {
            this.allowList = allowList;
            this.__explicitlySet__.add("allowList");
            return this;
        }
        /** List of metrics regex to be denied. */
        @com.fasterxml.jackson.annotation.JsonProperty("denyList")
        private java.util.List<String> denyList;

        /**
         * List of metrics regex to be denied.
         *
         * @param denyList the value to set
         * @return this builder
         */
        public Builder denyList(java.util.List<String> denyList) {
            this.denyList = denyList;
            this.__explicitlySet__.add("denyList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentKubernetesFilter build() {
            UnifiedAgentKubernetesFilter model =
                    new UnifiedAgentKubernetesFilter(this.name, this.allowList, this.denyList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentKubernetesFilter model) {
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UnifiedAgentKubernetesFilter(
            String name, java.util.List<String> allowList, java.util.List<String> denyList) {
        super(name);
        this.allowList = allowList;
        this.denyList = denyList;
    }

    /** List of metrics regex to be allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowList")
    private final java.util.List<String> allowList;

    /**
     * List of metrics regex to be allowed.
     *
     * @return the value
     */
    public java.util.List<String> getAllowList() {
        return allowList;
    }

    /** List of metrics regex to be denied. */
    @com.fasterxml.jackson.annotation.JsonProperty("denyList")
    private final java.util.List<String> denyList;

    /**
     * List of metrics regex to be denied.
     *
     * @return the value
     */
    public java.util.List<String> getDenyList() {
        return denyList;
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
        sb.append("UnifiedAgentKubernetesFilter(");
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
        if (!(o instanceof UnifiedAgentKubernetesFilter)) {
            return false;
        }

        UnifiedAgentKubernetesFilter other = (UnifiedAgentKubernetesFilter) o;
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
