/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The activation details for the Exadata Cloud@Customer infrastructure. Applies to Exadata Cloud@Customer instances only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActivateExadataInfrastructureDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActivateExadataInfrastructureDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"activationFile"})
    public ActivateExadataInfrastructureDetails(byte[] activationFile) {
        super();
        this.activationFile = activationFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The activation zip file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activationFile")
        private byte[] activationFile;

        /**
         * The activation zip file.
         * @param activationFile the value to set
         * @return this builder
         **/
        public Builder activationFile(byte[] activationFile) {
            this.activationFile = activationFile;
            this.__explicitlySet__.add("activationFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateExadataInfrastructureDetails build() {
            ActivateExadataInfrastructureDetails __instance__ =
                    new ActivateExadataInfrastructureDetails(activationFile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateExadataInfrastructureDetails o) {
            Builder copiedBuilder = activationFile(o.getActivationFile());

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
     * The activation zip file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activationFile")
    private final byte[] activationFile;

    /**
     * The activation zip file.
     * @return the value
     **/
    public byte[] getActivationFile() {
        return activationFile;
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
        sb.append("ActivateExadataInfrastructureDetails(");
        sb.append("activationFile=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.activationFile)
                                : (String.valueOf(this.activationFile)
                                        + (this.activationFile != null
                                                ? " (byte[" + this.activationFile.length + "])"
                                                : ""))));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateExadataInfrastructureDetails)) {
            return false;
        }

        ActivateExadataInfrastructureDetails other = (ActivateExadataInfrastructureDetails) o;
        return java.util.Arrays.equals(this.activationFile, other.activationFile)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.activationFile);
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
