/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to generate agent deploy script for a Fleet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateAgentDeployScriptDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateAgentDeployScriptDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"installKeyId", "osFamily", "isUserNameEnabled"})
    public GenerateAgentDeployScriptDetails(
            String installKeyId, OsFamily osFamily, Boolean isUserNameEnabled) {
        super();
        this.installKeyId = installKeyId;
        this.osFamily = osFamily;
        this.isUserNameEnabled = isUserNameEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the install key for which to generate the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
        private String installKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the install key for which to generate the script.
         * @param installKeyId the value to set
         * @return this builder
         **/
        public Builder installKeyId(String installKeyId) {
            this.installKeyId = installKeyId;
            this.__explicitlySet__.add("installKeyId");
            return this;
        }
        /**
         * The operating system type for the script. Currently only 'LINUX' and 'WINDOWS' are supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system type for the script. Currently only 'LINUX' and 'WINDOWS' are supported.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * Enable/disable user name collection on agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUserNameEnabled")
        private Boolean isUserNameEnabled;

        /**
         * Enable/disable user name collection on agent.
         * @param isUserNameEnabled the value to set
         * @return this builder
         **/
        public Builder isUserNameEnabled(Boolean isUserNameEnabled) {
            this.isUserNameEnabled = isUserNameEnabled;
            this.__explicitlySet__.add("isUserNameEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateAgentDeployScriptDetails build() {
            GenerateAgentDeployScriptDetails model =
                    new GenerateAgentDeployScriptDetails(
                            this.installKeyId, this.osFamily, this.isUserNameEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateAgentDeployScriptDetails model) {
            if (model.wasPropertyExplicitlySet("installKeyId")) {
                this.installKeyId(model.getInstallKeyId());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("isUserNameEnabled")) {
                this.isUserNameEnabled(model.getIsUserNameEnabled());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the install key for which to generate the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
    private final String installKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the install key for which to generate the script.
     * @return the value
     **/
    public String getInstallKeyId() {
        return installKeyId;
    }

    /**
     * The operating system type for the script. Currently only 'LINUX' and 'WINDOWS' are supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system type for the script. Currently only 'LINUX' and 'WINDOWS' are supported.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * Enable/disable user name collection on agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserNameEnabled")
    private final Boolean isUserNameEnabled;

    /**
     * Enable/disable user name collection on agent.
     * @return the value
     **/
    public Boolean getIsUserNameEnabled() {
        return isUserNameEnabled;
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
        sb.append("GenerateAgentDeployScriptDetails(");
        sb.append("super=").append(super.toString());
        sb.append("installKeyId=").append(String.valueOf(this.installKeyId));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", isUserNameEnabled=").append(String.valueOf(this.isUserNameEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateAgentDeployScriptDetails)) {
            return false;
        }

        GenerateAgentDeployScriptDetails other = (GenerateAgentDeployScriptDetails) o;
        return java.util.Objects.equals(this.installKeyId, other.installKeyId)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.isUserNameEnabled, other.isUserNameEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.installKeyId == null ? 43 : this.installKeyId.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserNameEnabled == null ? 43 : this.isUserNameEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
