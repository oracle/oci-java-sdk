/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * The activation details for the Database Infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivateInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivateInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"activationZipFile"})
    public ActivateInfrastructureDetails(byte[] activationZipFile) {
        super();
        this.activationZipFile = activationZipFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The activation zip file. */
        @com.fasterxml.jackson.annotation.JsonProperty("activationZipFile")
        private byte[] activationZipFile;

        /**
         * The activation zip file.
         *
         * @param activationZipFile the value to set
         * @return this builder
         */
        public Builder activationZipFile(byte[] activationZipFile) {
            this.activationZipFile = activationZipFile;
            this.__explicitlySet__.add("activationZipFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateInfrastructureDetails build() {
            ActivateInfrastructureDetails model =
                    new ActivateInfrastructureDetails(this.activationZipFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("activationZipFile")) {
                this.activationZipFile(model.getActivationZipFile());
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
    @com.fasterxml.jackson.annotation.JsonProperty("activationZipFile")
    private final byte[] activationZipFile;

    /**
     * The activation zip file.
     *
     * @return the value
     */
    public byte[] getActivationZipFile() {
        return activationZipFile;
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
        sb.append("ActivateInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("activationZipFile=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.activationZipFile)
                                : (String.valueOf(this.activationZipFile)
                                        + (this.activationZipFile != null
                                                ? " (byte[" + this.activationZipFile.length + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateInfrastructureDetails)) {
            return false;
        }

        ActivateInfrastructureDetails other = (ActivateInfrastructureDetails) o;
        return java.util.Arrays.equals(this.activationZipFile, other.activationZipFile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.activationZipFile);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
