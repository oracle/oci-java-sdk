/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * A summary of the Java release family information. A Java release family is typically a major
 * version in the Java version identifier. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaFamilySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JavaFamilySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "familyVersion",
        "displayName",
        "supportType",
        "endOfSupportLifeDate",
        "docUrl"
    })
    public JavaFamilySummary(
            String familyVersion,
            String displayName,
            SupportType supportType,
            java.util.Date endOfSupportLifeDate,
            String docUrl) {
        super();
        this.familyVersion = familyVersion;
        this.displayName = displayName;
        this.supportType = supportType;
        this.endOfSupportLifeDate = endOfSupportLifeDate;
        this.docUrl = docUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Java release family identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
        private String familyVersion;

        /**
         * The Java release family identifier.
         *
         * @param familyVersion the value to set
         * @return this builder
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            this.__explicitlySet__.add("familyVersion");
            return this;
        }
        /** The display name of the release family. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the release family.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** This indicates the support category for the Java release family. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportType")
        private SupportType supportType;

        /**
         * This indicates the support category for the Java release family.
         *
         * @param supportType the value to set
         * @return this builder
         */
        public Builder supportType(SupportType supportType) {
            this.supportType = supportType;
            this.__explicitlySet__.add("supportType");
            return this;
        }
        /**
         * The End of Support Life (EOSL) date of the Java release family (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
        private java.util.Date endOfSupportLifeDate;

        /**
         * The End of Support Life (EOSL) date of the Java release family (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param endOfSupportLifeDate the value to set
         * @return this builder
         */
        public Builder endOfSupportLifeDate(java.util.Date endOfSupportLifeDate) {
            this.endOfSupportLifeDate = endOfSupportLifeDate;
            this.__explicitlySet__.add("endOfSupportLifeDate");
            return this;
        }
        /** Link to access the documentation for the release. */
        @com.fasterxml.jackson.annotation.JsonProperty("docUrl")
        private String docUrl;

        /**
         * Link to access the documentation for the release.
         *
         * @param docUrl the value to set
         * @return this builder
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            this.__explicitlySet__.add("docUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaFamilySummary build() {
            JavaFamilySummary model =
                    new JavaFamilySummary(
                            this.familyVersion,
                            this.displayName,
                            this.supportType,
                            this.endOfSupportLifeDate,
                            this.docUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaFamilySummary model) {
            if (model.wasPropertyExplicitlySet("familyVersion")) {
                this.familyVersion(model.getFamilyVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("supportType")) {
                this.supportType(model.getSupportType());
            }
            if (model.wasPropertyExplicitlySet("endOfSupportLifeDate")) {
                this.endOfSupportLifeDate(model.getEndOfSupportLifeDate());
            }
            if (model.wasPropertyExplicitlySet("docUrl")) {
                this.docUrl(model.getDocUrl());
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

    /** The Java release family identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
    private final String familyVersion;

    /**
     * The Java release family identifier.
     *
     * @return the value
     */
    public String getFamilyVersion() {
        return familyVersion;
    }

    /** The display name of the release family. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the release family.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** This indicates the support category for the Java release family. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportType")
    private final SupportType supportType;

    /**
     * This indicates the support category for the Java release family.
     *
     * @return the value
     */
    public SupportType getSupportType() {
        return supportType;
    }

    /**
     * The End of Support Life (EOSL) date of the Java release family (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
    private final java.util.Date endOfSupportLifeDate;

    /**
     * The End of Support Life (EOSL) date of the Java release family (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getEndOfSupportLifeDate() {
        return endOfSupportLifeDate;
    }

    /** Link to access the documentation for the release. */
    @com.fasterxml.jackson.annotation.JsonProperty("docUrl")
    private final String docUrl;

    /**
     * Link to access the documentation for the release.
     *
     * @return the value
     */
    public String getDocUrl() {
        return docUrl;
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
        sb.append("JavaFamilySummary(");
        sb.append("super=").append(super.toString());
        sb.append("familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", supportType=").append(String.valueOf(this.supportType));
        sb.append(", endOfSupportLifeDate=").append(String.valueOf(this.endOfSupportLifeDate));
        sb.append(", docUrl=").append(String.valueOf(this.docUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaFamilySummary)) {
            return false;
        }

        JavaFamilySummary other = (JavaFamilySummary) o;
        return java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.supportType, other.supportType)
                && java.util.Objects.equals(this.endOfSupportLifeDate, other.endOfSupportLifeDate)
                && java.util.Objects.equals(this.docUrl, other.docUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.supportType == null ? 43 : this.supportType.hashCode());
        result =
                (result * PRIME)
                        + (this.endOfSupportLifeDate == null
                                ? 43
                                : this.endOfSupportLifeDate.hashCode());
        result = (result * PRIME) + (this.docUrl == null ? 43 : this.docUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
