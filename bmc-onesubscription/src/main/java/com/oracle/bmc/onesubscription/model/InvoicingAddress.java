/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Address. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InvoicingAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InvoicingAddress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "location",
        "name",
        "phone",
        "isBillTo",
        "isShipTo",
        "billSiteUseId",
        "service2SiteUseId",
        "tcaCustAcctSiteId",
        "tcaPartySiteNumber"
    })
    public InvoicingAddress(
            InvoicingLocation location,
            String name,
            String phone,
            Boolean isBillTo,
            Boolean isShipTo,
            Long billSiteUseId,
            Long service2SiteUseId,
            Long tcaCustAcctSiteId,
            String tcaPartySiteNumber) {
        super();
        this.location = location;
        this.name = name;
        this.phone = phone;
        this.isBillTo = isBillTo;
        this.isShipTo = isShipTo;
        this.billSiteUseId = billSiteUseId;
        this.service2SiteUseId = service2SiteUseId;
        this.tcaCustAcctSiteId = tcaCustAcctSiteId;
        this.tcaPartySiteNumber = tcaPartySiteNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private InvoicingLocation location;

        public Builder location(InvoicingLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** Address name identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Address name identifier.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Phone. */
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        /**
         * Phone.
         *
         * @param phone the value to set
         * @return this builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }
        /** Identify as the customer's billing address. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBillTo")
        private Boolean isBillTo;

        /**
         * Identify as the customer's billing address.
         *
         * @param isBillTo the value to set
         * @return this builder
         */
        public Builder isBillTo(Boolean isBillTo) {
            this.isBillTo = isBillTo;
            this.__explicitlySet__.add("isBillTo");
            return this;
        }
        /** Identify as the customer's shipping address. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShipTo")
        private Boolean isShipTo;

        /**
         * Identify as the customer's shipping address.
         *
         * @param isShipTo the value to set
         * @return this builder
         */
        public Builder isShipTo(Boolean isShipTo) {
            this.isShipTo = isShipTo;
            this.__explicitlySet__.add("isShipTo");
            return this;
        }
        /** Bill to site use Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("billSiteUseId")
        private Long billSiteUseId;

        /**
         * Bill to site use Id.
         *
         * @param billSiteUseId the value to set
         * @return this builder
         */
        public Builder billSiteUseId(Long billSiteUseId) {
            this.billSiteUseId = billSiteUseId;
            this.__explicitlySet__.add("billSiteUseId");
            return this;
        }
        /** Service to site use Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("service2SiteUseId")
        private Long service2SiteUseId;

        /**
         * Service to site use Id.
         *
         * @param service2SiteUseId the value to set
         * @return this builder
         */
        public Builder service2SiteUseId(Long service2SiteUseId) {
            this.service2SiteUseId = service2SiteUseId;
            this.__explicitlySet__.add("service2SiteUseId");
            return this;
        }
        /** TCA customer account site Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("tcaCustAcctSiteId")
        private Long tcaCustAcctSiteId;

        /**
         * TCA customer account site Id.
         *
         * @param tcaCustAcctSiteId the value to set
         * @return this builder
         */
        public Builder tcaCustAcctSiteId(Long tcaCustAcctSiteId) {
            this.tcaCustAcctSiteId = tcaCustAcctSiteId;
            this.__explicitlySet__.add("tcaCustAcctSiteId");
            return this;
        }
        /** Party site number. */
        @com.fasterxml.jackson.annotation.JsonProperty("tcaPartySiteNumber")
        private String tcaPartySiteNumber;

        /**
         * Party site number.
         *
         * @param tcaPartySiteNumber the value to set
         * @return this builder
         */
        public Builder tcaPartySiteNumber(String tcaPartySiteNumber) {
            this.tcaPartySiteNumber = tcaPartySiteNumber;
            this.__explicitlySet__.add("tcaPartySiteNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicingAddress build() {
            InvoicingAddress model =
                    new InvoicingAddress(
                            this.location,
                            this.name,
                            this.phone,
                            this.isBillTo,
                            this.isShipTo,
                            this.billSiteUseId,
                            this.service2SiteUseId,
                            this.tcaCustAcctSiteId,
                            this.tcaPartySiteNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicingAddress model) {
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("phone")) {
                this.phone(model.getPhone());
            }
            if (model.wasPropertyExplicitlySet("isBillTo")) {
                this.isBillTo(model.getIsBillTo());
            }
            if (model.wasPropertyExplicitlySet("isShipTo")) {
                this.isShipTo(model.getIsShipTo());
            }
            if (model.wasPropertyExplicitlySet("billSiteUseId")) {
                this.billSiteUseId(model.getBillSiteUseId());
            }
            if (model.wasPropertyExplicitlySet("service2SiteUseId")) {
                this.service2SiteUseId(model.getService2SiteUseId());
            }
            if (model.wasPropertyExplicitlySet("tcaCustAcctSiteId")) {
                this.tcaCustAcctSiteId(model.getTcaCustAcctSiteId());
            }
            if (model.wasPropertyExplicitlySet("tcaPartySiteNumber")) {
                this.tcaPartySiteNumber(model.getTcaPartySiteNumber());
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

    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final InvoicingLocation location;

    public InvoicingLocation getLocation() {
        return location;
    }

    /** Address name identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Address name identifier.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Phone. */
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    private final String phone;

    /**
     * Phone.
     *
     * @return the value
     */
    public String getPhone() {
        return phone;
    }

    /** Identify as the customer's billing address. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBillTo")
    private final Boolean isBillTo;

    /**
     * Identify as the customer's billing address.
     *
     * @return the value
     */
    public Boolean getIsBillTo() {
        return isBillTo;
    }

    /** Identify as the customer's shipping address. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShipTo")
    private final Boolean isShipTo;

    /**
     * Identify as the customer's shipping address.
     *
     * @return the value
     */
    public Boolean getIsShipTo() {
        return isShipTo;
    }

    /** Bill to site use Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("billSiteUseId")
    private final Long billSiteUseId;

    /**
     * Bill to site use Id.
     *
     * @return the value
     */
    public Long getBillSiteUseId() {
        return billSiteUseId;
    }

    /** Service to site use Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("service2SiteUseId")
    private final Long service2SiteUseId;

    /**
     * Service to site use Id.
     *
     * @return the value
     */
    public Long getService2SiteUseId() {
        return service2SiteUseId;
    }

    /** TCA customer account site Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("tcaCustAcctSiteId")
    private final Long tcaCustAcctSiteId;

    /**
     * TCA customer account site Id.
     *
     * @return the value
     */
    public Long getTcaCustAcctSiteId() {
        return tcaCustAcctSiteId;
    }

    /** Party site number. */
    @com.fasterxml.jackson.annotation.JsonProperty("tcaPartySiteNumber")
    private final String tcaPartySiteNumber;

    /**
     * Party site number.
     *
     * @return the value
     */
    public String getTcaPartySiteNumber() {
        return tcaPartySiteNumber;
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
        sb.append("InvoicingAddress(");
        sb.append("super=").append(super.toString());
        sb.append("location=").append(String.valueOf(this.location));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", phone=").append(String.valueOf(this.phone));
        sb.append(", isBillTo=").append(String.valueOf(this.isBillTo));
        sb.append(", isShipTo=").append(String.valueOf(this.isShipTo));
        sb.append(", billSiteUseId=").append(String.valueOf(this.billSiteUseId));
        sb.append(", service2SiteUseId=").append(String.valueOf(this.service2SiteUseId));
        sb.append(", tcaCustAcctSiteId=").append(String.valueOf(this.tcaCustAcctSiteId));
        sb.append(", tcaPartySiteNumber=").append(String.valueOf(this.tcaPartySiteNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicingAddress)) {
            return false;
        }

        InvoicingAddress other = (InvoicingAddress) o;
        return java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.phone, other.phone)
                && java.util.Objects.equals(this.isBillTo, other.isBillTo)
                && java.util.Objects.equals(this.isShipTo, other.isShipTo)
                && java.util.Objects.equals(this.billSiteUseId, other.billSiteUseId)
                && java.util.Objects.equals(this.service2SiteUseId, other.service2SiteUseId)
                && java.util.Objects.equals(this.tcaCustAcctSiteId, other.tcaCustAcctSiteId)
                && java.util.Objects.equals(this.tcaPartySiteNumber, other.tcaPartySiteNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.phone == null ? 43 : this.phone.hashCode());
        result = (result * PRIME) + (this.isBillTo == null ? 43 : this.isBillTo.hashCode());
        result = (result * PRIME) + (this.isShipTo == null ? 43 : this.isShipTo.hashCode());
        result =
                (result * PRIME)
                        + (this.billSiteUseId == null ? 43 : this.billSiteUseId.hashCode());
        result =
                (result * PRIME)
                        + (this.service2SiteUseId == null ? 43 : this.service2SiteUseId.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaCustAcctSiteId == null ? 43 : this.tcaCustAcctSiteId.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaPartySiteNumber == null
                                ? 43
                                : this.tcaPartySiteNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
