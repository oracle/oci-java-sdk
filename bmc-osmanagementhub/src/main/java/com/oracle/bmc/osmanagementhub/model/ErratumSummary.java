/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for an erratum. An erratum is an important software change which can include security advisories, bug fixes, or enhancements.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ErratumSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ErratumSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "synopsis",
        "timeIssued",
        "timeUpdated",
        "classificationType",
        "relatedCves",
        "osFamilies",
        "advisorySeverity",
        "advisoryType"
    })
    public ErratumSummary(
            String name,
            String synopsis,
            java.util.Date timeIssued,
            java.util.Date timeUpdated,
            ClassificationTypes classificationType,
            java.util.List<String> relatedCves,
            java.util.List<OsFamily> osFamilies,
            AdvisorySeverity advisorySeverity,
            AdvisoryTypes advisoryType) {
        super();
        this.name = name;
        this.synopsis = synopsis;
        this.timeIssued = timeIssued;
        this.timeUpdated = timeUpdated;
        this.classificationType = classificationType;
        this.relatedCves = relatedCves;
        this.osFamilies = osFamilies;
        this.advisorySeverity = advisorySeverity;
        this.advisoryType = advisoryType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Advisory name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Advisory name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Summary description of the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
        private String synopsis;

        /**
         * Summary description of the erratum.
         * @param synopsis the value to set
         * @return this builder
         **/
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            this.__explicitlySet__.add("synopsis");
            return this;
        }
        /**
         * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
        private java.util.Date timeIssued;

        /**
         * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeIssued the value to set
         * @return this builder
         **/
        public Builder timeIssued(java.util.Date timeIssued) {
            this.timeIssued = timeIssued;
            this.__explicitlySet__.add("timeIssued");
            return this;
        }
        /**
         * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Type of the erratum. This property is deprecated and it will be removed in a future API release. Please refer to the advisoryType property instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classificationType")
        private ClassificationTypes classificationType;

        /**
         * Type of the erratum. This property is deprecated and it will be removed in a future API release. Please refer to the advisoryType property instead.
         * @param classificationType the value to set
         * @return this builder
         **/
        public Builder classificationType(ClassificationTypes classificationType) {
            this.classificationType = classificationType;
            this.__explicitlySet__.add("classificationType");
            return this;
        }
        /**
         * List of CVEs applicable to this erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * List of CVEs applicable to this erratum.
         * @param relatedCves the value to set
         * @return this builder
         **/
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }
        /**
         * List of affected OS families.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
        private java.util.List<OsFamily> osFamilies;

        /**
         * List of affected OS families.
         * @param osFamilies the value to set
         * @return this builder
         **/
        public Builder osFamilies(java.util.List<OsFamily> osFamilies) {
            this.osFamilies = osFamilies;
            this.__explicitlySet__.add("osFamilies");
            return this;
        }
        /**
         * The severity advisory. Only valid for security type advisories.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advisorySeverity")
        private AdvisorySeverity advisorySeverity;

        /**
         * The severity advisory. Only valid for security type advisories.
         * @param advisorySeverity the value to set
         * @return this builder
         **/
        public Builder advisorySeverity(AdvisorySeverity advisorySeverity) {
            this.advisorySeverity = advisorySeverity;
            this.__explicitlySet__.add("advisorySeverity");
            return this;
        }
        /**
         * The advisory type of the erratum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
        private AdvisoryTypes advisoryType;

        /**
         * The advisory type of the erratum.
         * @param advisoryType the value to set
         * @return this builder
         **/
        public Builder advisoryType(AdvisoryTypes advisoryType) {
            this.advisoryType = advisoryType;
            this.__explicitlySet__.add("advisoryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ErratumSummary build() {
            ErratumSummary model =
                    new ErratumSummary(
                            this.name,
                            this.synopsis,
                            this.timeIssued,
                            this.timeUpdated,
                            this.classificationType,
                            this.relatedCves,
                            this.osFamilies,
                            this.advisorySeverity,
                            this.advisoryType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ErratumSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("synopsis")) {
                this.synopsis(model.getSynopsis());
            }
            if (model.wasPropertyExplicitlySet("timeIssued")) {
                this.timeIssued(model.getTimeIssued());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("classificationType")) {
                this.classificationType(model.getClassificationType());
            }
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
            }
            if (model.wasPropertyExplicitlySet("osFamilies")) {
                this.osFamilies(model.getOsFamilies());
            }
            if (model.wasPropertyExplicitlySet("advisorySeverity")) {
                this.advisorySeverity(model.getAdvisorySeverity());
            }
            if (model.wasPropertyExplicitlySet("advisoryType")) {
                this.advisoryType(model.getAdvisoryType());
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
     * Advisory name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Advisory name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Summary description of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("synopsis")
    private final String synopsis;

    /**
     * Summary description of the erratum.
     * @return the value
     **/
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIssued")
    private final java.util.Date timeIssued;

    /**
     * The date and time the erratum was issued (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     **/
    public java.util.Date getTimeIssued() {
        return timeIssued;
    }

    /**
     * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the erratum was updated (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Type of the erratum. This property is deprecated and it will be removed in a future API release. Please refer to the advisoryType property instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classificationType")
    private final ClassificationTypes classificationType;

    /**
     * Type of the erratum. This property is deprecated and it will be removed in a future API release. Please refer to the advisoryType property instead.
     * @return the value
     **/
    public ClassificationTypes getClassificationType() {
        return classificationType;
    }

    /**
     * List of CVEs applicable to this erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * List of CVEs applicable to this erratum.
     * @return the value
     **/
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    /**
     * List of affected OS families.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
    private final java.util.List<OsFamily> osFamilies;

    /**
     * List of affected OS families.
     * @return the value
     **/
    public java.util.List<OsFamily> getOsFamilies() {
        return osFamilies;
    }

    /**
     * The severity advisory. Only valid for security type advisories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisorySeverity")
    private final AdvisorySeverity advisorySeverity;

    /**
     * The severity advisory. Only valid for security type advisories.
     * @return the value
     **/
    public AdvisorySeverity getAdvisorySeverity() {
        return advisorySeverity;
    }

    /**
     * The advisory type of the erratum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advisoryType")
    private final AdvisoryTypes advisoryType;

    /**
     * The advisory type of the erratum.
     * @return the value
     **/
    public AdvisoryTypes getAdvisoryType() {
        return advisoryType;
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
        sb.append("ErratumSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", synopsis=").append(String.valueOf(this.synopsis));
        sb.append(", timeIssued=").append(String.valueOf(this.timeIssued));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", classificationType=").append(String.valueOf(this.classificationType));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(", osFamilies=").append(String.valueOf(this.osFamilies));
        sb.append(", advisorySeverity=").append(String.valueOf(this.advisorySeverity));
        sb.append(", advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ErratumSummary)) {
            return false;
        }

        ErratumSummary other = (ErratumSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.synopsis, other.synopsis)
                && java.util.Objects.equals(this.timeIssued, other.timeIssued)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.classificationType, other.classificationType)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.osFamilies, other.osFamilies)
                && java.util.Objects.equals(this.advisorySeverity, other.advisorySeverity)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.synopsis == null ? 43 : this.synopsis.hashCode());
        result = (result * PRIME) + (this.timeIssued == null ? 43 : this.timeIssued.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.classificationType == null
                                ? 43
                                : this.classificationType.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result = (result * PRIME) + (this.osFamilies == null ? 43 : this.osFamilies.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorySeverity == null ? 43 : this.advisorySeverity.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
