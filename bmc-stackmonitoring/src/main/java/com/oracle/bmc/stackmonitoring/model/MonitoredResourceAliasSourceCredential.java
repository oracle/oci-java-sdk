/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Monitored Resource Alias Reference Source Credential. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MonitoredResourceAliasSourceCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MonitoredResourceAliasSourceCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"source", "name", "service"})
    public MonitoredResourceAliasSourceCredential(String source, String name, String service) {
        super();
        this.source = source;
        this.name = name;
        this.service = service;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source type and source name combination,delimited with (.) separator. This refers to
         * the pre-existing source which alias cred should point to. Ex. {source type}.{source name}
         * and source type max char limit is 63.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * The source type and source name combination,delimited with (.) separator. This refers to
         * the pre-existing source which alias cred should point to. Ex. {source type}.{source name}
         * and source type max char limit is 63.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * The name of the pre-existing source credential which alias cred should point to. This
         * should refer to the pre-existing source attribute which is bound to credential name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the pre-existing source credential which alias cred should point to. This
         * should refer to the pre-existing source attribute which is bound to credential name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the service owning the credential. Example: stack-monitoring or dbmgmt */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The name of the service owning the credential. Example: stack-monitoring or dbmgmt
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoredResourceAliasSourceCredential build() {
            MonitoredResourceAliasSourceCredential model =
                    new MonitoredResourceAliasSourceCredential(
                            this.source, this.name, this.service);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredResourceAliasSourceCredential model) {
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
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

    /**
     * The source type and source name combination,delimited with (.) separator. This refers to the
     * pre-existing source which alias cred should point to. Ex. {source type}.{source name} and
     * source type max char limit is 63.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * The source type and source name combination,delimited with (.) separator. This refers to the
     * pre-existing source which alias cred should point to. Ex. {source type}.{source name} and
     * source type max char limit is 63.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /**
     * The name of the pre-existing source credential which alias cred should point to. This should
     * refer to the pre-existing source attribute which is bound to credential name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the pre-existing source credential which alias cred should point to. This should
     * refer to the pre-existing source attribute which is bound to credential name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the service owning the credential. Example: stack-monitoring or dbmgmt */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The name of the service owning the credential. Example: stack-monitoring or dbmgmt
     *
     * @return the value
     */
    public String getService() {
        return service;
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
        sb.append("MonitoredResourceAliasSourceCredential(");
        sb.append("super=").append(super.toString());
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoredResourceAliasSourceCredential)) {
            return false;
        }

        MonitoredResourceAliasSourceCredential other = (MonitoredResourceAliasSourceCredential) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.service, other.service)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
