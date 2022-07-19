/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Monitored Resource Alias Credential Details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoredResourceAliasCredential.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitoredResourceAliasCredential {
    @Deprecated
    @java.beans.ConstructorProperties({"source", "name", "credential"})
    public MonitoredResourceAliasCredential(
            String source, String name, MonitoredResourceAliasSourceCredential credential) {
        super();
        this.source = source;
        this.name = name;
        this.credential = credential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source type and source name combination,delimited with (.) separator. Ex. {source type}.{source name} and source type max char limit is 63.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * The source type and source name combination,delimited with (.) separator. Ex. {source type}.{source name} and source type max char limit is 63.
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * The name of the alias, within the context of the source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the alias, within the context of the source.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credential")
        private MonitoredResourceAliasSourceCredential credential;

        public Builder credential(MonitoredResourceAliasSourceCredential credential) {
            this.credential = credential;
            this.__explicitlySet__.add("credential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoredResourceAliasCredential build() {
            MonitoredResourceAliasCredential __instance__ =
                    new MonitoredResourceAliasCredential(source, name, credential);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredResourceAliasCredential o) {
            Builder copiedBuilder =
                    source(o.getSource()).name(o.getName()).credential(o.getCredential());

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
     * The source type and source name combination,delimited with (.) separator. Ex. {source type}.{source name} and source type max char limit is 63.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * The source type and source name combination,delimited with (.) separator. Ex. {source type}.{source name} and source type max char limit is 63.
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * The name of the alias, within the context of the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the alias, within the context of the source.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credential")
    private final MonitoredResourceAliasSourceCredential credential;

    public MonitoredResourceAliasSourceCredential getCredential() {
        return credential;
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
        sb.append("MonitoredResourceAliasCredential(");
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", credential=").append(String.valueOf(this.credential));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoredResourceAliasCredential)) {
            return false;
        }

        MonitoredResourceAliasCredential other = (MonitoredResourceAliasCredential) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.credential, other.credential)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.credential == null ? 43 : this.credential.hashCode());
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
