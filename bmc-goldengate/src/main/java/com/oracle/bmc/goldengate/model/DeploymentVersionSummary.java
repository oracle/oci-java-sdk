/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The summary data of a specific deployment version.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeploymentVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeploymentVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oggVersion",
        "deploymentType",
        "timeReleased",
        "releaseType",
        "isSecurityFix"
    })
    public DeploymentVersionSummary(
            String oggVersion,
            DeploymentType deploymentType,
            java.util.Date timeReleased,
            ReleaseType releaseType,
            Boolean isSecurityFix) {
        super();
        this.oggVersion = oggVersion;
        this.deploymentType = deploymentType;
        this.timeReleased = timeReleased;
        this.releaseType = releaseType;
        this.isSecurityFix = isSecurityFix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Version of OGG
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         **/
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /**
         * The type of deployment, the value determines the exact 'type' of service executed in the Deployment.
         * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.  Its use is discouraged
         *       in favor of the equivalent 'DATABASE_ORACLE' value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, the value determines the exact 'type' of service executed in the Deployment.
         * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.  Its use is discouraged
         *       in favor of the equivalent 'DATABASE_ORACLE' value.
         *
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The time the resource was released. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The time the resource was released. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * The type of release.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
        private ReleaseType releaseType;

        /**
         * The type of release.
         *
         * @param releaseType the value to set
         * @return this builder
         **/
        public Builder releaseType(ReleaseType releaseType) {
            this.releaseType = releaseType;
            this.__explicitlySet__.add("releaseType");
            return this;
        }
        /**
         * Indicates if OGG release contains security fix.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSecurityFix")
        private Boolean isSecurityFix;

        /**
         * Indicates if OGG release contains security fix.
         *
         * @param isSecurityFix the value to set
         * @return this builder
         **/
        public Builder isSecurityFix(Boolean isSecurityFix) {
            this.isSecurityFix = isSecurityFix;
            this.__explicitlySet__.add("isSecurityFix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentVersionSummary build() {
            DeploymentVersionSummary model =
                    new DeploymentVersionSummary(
                            this.oggVersion,
                            this.deploymentType,
                            this.timeReleased,
                            this.releaseType,
                            this.isSecurityFix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentVersionSummary model) {
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("releaseType")) {
                this.releaseType(model.getReleaseType());
            }
            if (model.wasPropertyExplicitlySet("isSecurityFix")) {
                this.isSecurityFix(model.getIsSecurityFix());
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
     * Version of OGG
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     **/
    public String getOggVersion() {
        return oggVersion;
    }

    /**
     * The type of deployment, the value determines the exact 'type' of service executed in the Deployment.
     * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.  Its use is discouraged
     *       in favor of the equivalent 'DATABASE_ORACLE' value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, the value determines the exact 'type' of service executed in the Deployment.
     * NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.  Its use is discouraged
     *       in favor of the equivalent 'DATABASE_ORACLE' value.
     *
     * @return the value
     **/
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The time the resource was released. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The time the resource was released. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * The type of release.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
    private final ReleaseType releaseType;

    /**
     * The type of release.
     *
     * @return the value
     **/
    public ReleaseType getReleaseType() {
        return releaseType;
    }

    /**
     * Indicates if OGG release contains security fix.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecurityFix")
    private final Boolean isSecurityFix;

    /**
     * Indicates if OGG release contains security fix.
     *
     * @return the value
     **/
    public Boolean getIsSecurityFix() {
        return isSecurityFix;
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
        sb.append("DeploymentVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", releaseType=").append(String.valueOf(this.releaseType));
        sb.append(", isSecurityFix=").append(String.valueOf(this.isSecurityFix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentVersionSummary)) {
            return false;
        }

        DeploymentVersionSummary other = (DeploymentVersionSummary) o;
        return java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.releaseType, other.releaseType)
                && java.util.Objects.equals(this.isSecurityFix, other.isSecurityFix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.releaseType == null ? 43 : this.releaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isSecurityFix == null ? 43 : this.isSecurityFix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
