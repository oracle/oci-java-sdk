/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Information about the OpenSearch cluster backup to restore.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestoreOpensearchClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RestoreOpensearchClusterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"opensearchClusterBackupId", "compartmentId", "prefix"})
    public RestoreOpensearchClusterDetails(
            String opensearchClusterBackupId, String compartmentId, String prefix) {
        super();
        this.opensearchClusterBackupId = opensearchClusterBackupId;
        this.compartmentId = compartmentId;
        this.prefix = prefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the cluster backup to restore.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opensearchClusterBackupId")
        private String opensearchClusterBackupId;

        /**
         * The OCID of the cluster backup to restore.
         * @param opensearchClusterBackupId the value to set
         * @return this builder
         **/
        public Builder opensearchClusterBackupId(String opensearchClusterBackupId) {
            this.opensearchClusterBackupId = opensearchClusterBackupId;
            this.__explicitlySet__.add("opensearchClusterBackupId");
            return this;
        }
        /**
         * The OCID of the compartment where the cluster backup is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the cluster backup is located.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The prefix for the indices in the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The prefix for the indices in the cluster backup.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreOpensearchClusterDetails build() {
            RestoreOpensearchClusterDetails __instance__ =
                    new RestoreOpensearchClusterDetails(
                            opensearchClusterBackupId, compartmentId, prefix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreOpensearchClusterDetails o) {
            Builder copiedBuilder =
                    opensearchClusterBackupId(o.getOpensearchClusterBackupId())
                            .compartmentId(o.getCompartmentId())
                            .prefix(o.getPrefix());

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
     * The OCID of the cluster backup to restore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opensearchClusterBackupId")
    private final String opensearchClusterBackupId;

    /**
     * The OCID of the cluster backup to restore.
     * @return the value
     **/
    public String getOpensearchClusterBackupId() {
        return opensearchClusterBackupId;
    }

    /**
     * The OCID of the compartment where the cluster backup is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the cluster backup is located.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The prefix for the indices in the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The prefix for the indices in the cluster backup.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
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
        sb.append("RestoreOpensearchClusterDetails(");
        sb.append("opensearchClusterBackupId=")
                .append(String.valueOf(this.opensearchClusterBackupId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreOpensearchClusterDetails)) {
            return false;
        }

        RestoreOpensearchClusterDetails other = (RestoreOpensearchClusterDetails) o;
        return java.util.Objects.equals(
                        this.opensearchClusterBackupId, other.opensearchClusterBackupId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.opensearchClusterBackupId == null
                                ? 43
                                : this.opensearchClusterBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
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
