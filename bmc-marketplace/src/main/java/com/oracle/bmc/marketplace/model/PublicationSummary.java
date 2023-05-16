/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for a summary of an Oracle Cloud Infrastructure publication. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PublicationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PublicationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "compartmentId",
        "id",
        "name",
        "shortDescription",
        "icon",
        "packageType",
        "supportedOperatingSystems",
        "listingType",
        "timeCreated"
    })
    public PublicationSummary(
            Publication.LifecycleState lifecycleState,
            String compartmentId,
            String id,
            String name,
            String shortDescription,
            UploadData icon,
            PackageTypeEnum packageType,
            java.util.List<OperatingSystem> supportedOperatingSystems,
            ListingType listingType,
            java.util.Date timeCreated) {
        super();
        this.lifecycleState = lifecycleState;
        this.compartmentId = compartmentId;
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.icon = icon;
        this.packageType = packageType;
        this.supportedOperatingSystems = supportedOperatingSystems;
        this.listingType = listingType;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The lifecycle state of the publication. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Publication.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the publication.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Publication.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the publication exists.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the publication exists.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The unique identifier for the publication in Marketplace. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the publication in Marketplace.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the publication, which is also used in the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the publication, which is also used in the listing.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A short description of the publication to use in the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the publication to use in the listing.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private UploadData icon;

        public Builder icon(UploadData icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }
        /** The listing's package type. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        /**
         * The listing's package type.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** The list of operating systems supported by the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
        private java.util.List<OperatingSystem> supportedOperatingSystems;

        /**
         * The list of operating systems supported by the listing.
         *
         * @param supportedOperatingSystems the value to set
         * @return this builder
         */
        public Builder supportedOperatingSystems(
                java.util.List<OperatingSystem> supportedOperatingSystems) {
            this.supportedOperatingSystems = supportedOperatingSystems;
            this.__explicitlySet__.add("supportedOperatingSystems");
            return this;
        }
        /**
         * The publisher category to which the publication belongs. The publisher category informs
         * where the listing appears for use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        /**
         * The publisher category to which the publication belongs. The publisher category informs
         * where the listing appears for use.
         *
         * @param listingType the value to set
         * @return this builder
         */
        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }
        /**
         * The date and time the publication was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the publication was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublicationSummary build() {
            PublicationSummary model =
                    new PublicationSummary(
                            this.lifecycleState,
                            this.compartmentId,
                            this.id,
                            this.name,
                            this.shortDescription,
                            this.icon,
                            this.packageType,
                            this.supportedOperatingSystems,
                            this.listingType,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublicationSummary model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("supportedOperatingSystems")) {
                this.supportedOperatingSystems(model.getSupportedOperatingSystems());
            }
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The lifecycle state of the publication. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Publication.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the publication.
     *
     * @return the value
     */
    public Publication.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the publication exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the publication exists.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier for the publication in Marketplace. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the publication in Marketplace.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the publication, which is also used in the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the publication, which is also used in the listing.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A short description of the publication to use in the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the publication to use in the listing.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final UploadData icon;

    public UploadData getIcon() {
        return icon;
    }

    /** The listing's package type. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageTypeEnum packageType;

    /**
     * The listing's package type.
     *
     * @return the value
     */
    public PackageTypeEnum getPackageType() {
        return packageType;
    }

    /** The list of operating systems supported by the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
    private final java.util.List<OperatingSystem> supportedOperatingSystems;

    /**
     * The list of operating systems supported by the listing.
     *
     * @return the value
     */
    public java.util.List<OperatingSystem> getSupportedOperatingSystems() {
        return supportedOperatingSystems;
    }

    /**
     * The publisher category to which the publication belongs. The publisher category informs where
     * the listing appears for use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    private final ListingType listingType;

    /**
     * The publisher category to which the publication belongs. The publisher category informs where
     * the listing appears for use.
     *
     * @return the value
     */
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * The date and time the publication was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the publication was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("PublicationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", supportedOperatingSystems=")
                .append(String.valueOf(this.supportedOperatingSystems));
        sb.append(", listingType=").append(String.valueOf(this.listingType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublicationSummary)) {
            return false;
        }

        PublicationSummary other = (PublicationSummary) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(
                        this.supportedOperatingSystems, other.supportedOperatingSystems)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOperatingSystems == null
                                ? 43
                                : this.supportedOperatingSystems.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
