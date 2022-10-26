/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The activation details for the Exadata Cloud@Customer infrastructure. Applies to Exadata
 * Cloud@Customer instances only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivateExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ActivateExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"activationFile"})
    public ActivateExadataInfrastructureDetails(byte[] activationFile) {
        super();
        this.activationFile = activationFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The activation zip file. */
        @com.fasterxml.jackson.annotation.JsonProperty("activationFile")
        private byte[] activationFile;

        /**
         * The activation zip file.
         *
         * @param activationFile the value to set
         * @return this builder
         */
        public Builder activationFile(byte[] activationFile) {
            this.activationFile = activationFile;
            this.__explicitlySet__.add("activationFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateExadataInfrastructureDetails build() {
            ActivateExadataInfrastructureDetails model =
                    new ActivateExadataInfrastructureDetails(this.activationFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("activationFile")) {
                this.activationFile(model.getActivationFile());
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

    /** The activation zip file. */
    @com.fasterxml.jackson.annotation.JsonProperty("activationFile")
    private final byte[] activationFile;

    /**
     * The activation zip file.
     *
     * @return the value
     */
    public byte[] getActivationFile() {
        return activationFile;
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
        sb.append("ActivateExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("activationFile=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.activationFile)
                                : (String.valueOf(this.activationFile)
                                        + (this.activationFile != null
                                                ? " (byte[" + this.activationFile.length + "])"
                                                : ""))));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.activationFile);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
