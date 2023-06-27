/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An erratum associated with a managed instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedInstanceErratumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstanceErratumSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "advisoryType",
        "timeIssued",
        "synopsis",
        "relatedCves",
        "packages"
    })
    public ManagedInstanceErratumSummary(
            String name,
            ClassificationTypes advisoryType,
            java.util.Date timeIssued,
            String synopsis,
            java.util.List<String> relatedCves,
            java.util.List<PackageNameSummary> packages) {
        super();
        this.name = name;
        this.advisoryType = advisoryType;
        this.timeIssued = timeIssued;
        this.synopsis = synopsis;
        this.relatedCves = relatedCves;
        this.packages = packages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The identifier of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The identifier of the erratum.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private ClassificationTypes advisoryType;

        /**
         * The type of the erratum.
         *
         * @param advisoryType the value to set
         * @return this builder
         */
        public Builder advisoryType(ClassificationTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }
        /**
         * The date and time the package was issued by a providing erratum (if available), as
         * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
        private java.util.Date timeIssued;

        /**
         * The date and time the package was issued by a providing erratum (if available), as
         * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeIssued the value to set
         * @return this builder
         */
        public Builder timeIssued(java.util.Date timeIssued) {
            this.timeIssued = timeIssued;
            this.__explicitlySet__.add("timeIssued");
            return this;
        }
        /** Summary description of the erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
        private String synopsis;

        /**
         * Summary description of the erratum.
         *
         * @param synopsis the value to set
         * @return this builder
         */
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            this.__explicitlySet__.add("synopsis");
            return this;
        }
        /** List of CVEs applicable to this erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * List of CVEs applicable to this erratum.
         *
         * @param relatedCves the value to set
         * @return this builder
         */
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }
        /** The list of Packages affected by this erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<PackageNameSummary> packages;

        /**
         * The list of Packages affected by this erratum.
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<PackageNameSummary> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstanceErratumSummary build() {
            ManagedInstanceErratumSummary model =
                    new ManagedInstanceErratumSummary(
                            this.name,
                            this.advisoryType,
                            this.timeIssued,
                            this.synopsis,
                            this.relatedCves,
                            this.packages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceErratumSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("advisoryType")) {
                this.advisoryType(model.getAdvisoryType());
            }
            if (model.wasPropertyExplicitlySet("timeIssued")) {
                this.timeIssued(model.getTimeIssued());
            }
            if (model.wasPropertyExplicitlySet("synopsis")) {
                this.synopsis(model.getSynopsis());
            }
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
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

    /** The identifier of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The identifier of the erratum.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final ClassificationTypes advisoryType;

    /**
     * The type of the erratum.
     *
     * @return the value
     */
    public ClassificationTypes getAdvisoryType() {
        return advisoryType;
    }

    /**
     * The date and time the package was issued by a providing erratum (if available), as described
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
    private final java.util.Date timeIssued;

    /**
     * The date and time the package was issued by a providing erratum (if available), as described
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeIssued() {
        return timeIssued;
    }

    /** Summary description of the erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    private final String synopsis;

    /**
     * Summary description of the erratum.
     *
     * @return the value
     */
    public String getSynopsis() {
        return synopsis;
    }

    /** List of CVEs applicable to this erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * List of CVEs applicable to this erratum.
     *
     * @return the value
     */
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    /** The list of Packages affected by this erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<PackageNameSummary> packages;

    /**
     * The list of Packages affected by this erratum.
     *
     * @return the value
     */
    public java.util.List<PackageNameSummary> getPackages() {
        return packages;
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
        sb.append("ManagedInstanceErratumSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(", timeIssued=").append(String.valueOf(this.timeIssued));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstanceErratumSummary)) {
            return false;
        }

        ManagedInstanceErratumSummary other = (ManagedInstanceErratumSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.timeIssued, other.timeIssued)
                && java.util.Objects.equals(this.synopsis, other.synopsis)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.packages, other.packages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.timeIssued == null ? 43 : this.timeIssued.hashCode());
        result = (result * PRIME) + (this.synopsis == null ? 43 : this.synopsis.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
