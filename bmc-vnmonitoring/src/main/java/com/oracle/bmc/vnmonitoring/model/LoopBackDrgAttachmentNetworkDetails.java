/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the loopback attachment on the DRG. A loopback attachment can be used to terminate a
 * virtual circuit that is carrying an IPSec tunnel, routing traffic directly to the IPSec tunnel
 * attachment where the tunnel can terminate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoopBackDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoopBackDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * target IPSec tunnel attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ids")
        private java.util.List<String> ids;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * target IPSec tunnel attachment.
         *
         * @param ids the value to set
         * @return this builder
         */
        public Builder ids(java.util.List<String> ids) {
            this.ids = ids;
            this.__explicitlySet__.add("ids");
            return this;
        }
        /** The MPLS label of the DRG attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("mplsLabel")
        private Integer mplsLabel;

        /**
         * The MPLS label of the DRG attachment.
         *
         * @param mplsLabel the value to set
         * @return this builder
         */
        public Builder mplsLabel(Integer mplsLabel) {
            this.mplsLabel = mplsLabel;
            this.__explicitlySet__.add("mplsLabel");
            return this;
        }
        /**
         * Routes which may be imported from the attachment (subject to import policy) appear in the
         * route reflectors tagged with the attachment's import route target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("importRouteTarget")
        private String importRouteTarget;

        /**
         * Routes which may be imported from the attachment (subject to import policy) appear in the
         * route reflectors tagged with the attachment's import route target.
         *
         * @param importRouteTarget the value to set
         * @return this builder
         */
        public Builder importRouteTarget(String importRouteTarget) {
            this.importRouteTarget = importRouteTarget;
            this.__explicitlySet__.add("importRouteTarget");
            return this;
        }
        /**
         * Routes which are exported to the attachment are exported to the route reflectors with the
         * route target set to the value of the attachment's export route target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportRouteTarget")
        private String exportRouteTarget;

        /**
         * Routes which are exported to the attachment are exported to the route reflectors with the
         * route target set to the value of the attachment's export route target.
         *
         * @param exportRouteTarget the value to set
         * @return this builder
         */
        public Builder exportRouteTarget(String exportRouteTarget) {
            this.exportRouteTarget = exportRouteTarget;
            this.__explicitlySet__.add("exportRouteTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoopBackDrgAttachmentNetworkDetails build() {
            LoopBackDrgAttachmentNetworkDetails model =
                    new LoopBackDrgAttachmentNetworkDetails(
                            this.id,
                            this.ids,
                            this.mplsLabel,
                            this.importRouteTarget,
                            this.exportRouteTarget);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoopBackDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ids")) {
                this.ids(model.getIds());
            }
            if (model.wasPropertyExplicitlySet("mplsLabel")) {
                this.mplsLabel(model.getMplsLabel());
            }
            if (model.wasPropertyExplicitlySet("importRouteTarget")) {
                this.importRouteTarget(model.getImportRouteTarget());
            }
            if (model.wasPropertyExplicitlySet("exportRouteTarget")) {
                this.exportRouteTarget(model.getExportRouteTarget());
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

    @Deprecated
    public LoopBackDrgAttachmentNetworkDetails(
            String id,
            java.util.List<String> ids,
            Integer mplsLabel,
            String importRouteTarget,
            String exportRouteTarget) {
        super(id);
        this.ids = ids;
        this.mplsLabel = mplsLabel;
        this.importRouteTarget = importRouteTarget;
        this.exportRouteTarget = exportRouteTarget;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * target IPSec tunnel attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ids")
    private final java.util.List<String> ids;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * target IPSec tunnel attachment.
     *
     * @return the value
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /** The MPLS label of the DRG attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("mplsLabel")
    private final Integer mplsLabel;

    /**
     * The MPLS label of the DRG attachment.
     *
     * @return the value
     */
    public Integer getMplsLabel() {
        return mplsLabel;
    }

    /**
     * Routes which may be imported from the attachment (subject to import policy) appear in the
     * route reflectors tagged with the attachment's import route target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importRouteTarget")
    private final String importRouteTarget;

    /**
     * Routes which may be imported from the attachment (subject to import policy) appear in the
     * route reflectors tagged with the attachment's import route target.
     *
     * @return the value
     */
    public String getImportRouteTarget() {
        return importRouteTarget;
    }

    /**
     * Routes which are exported to the attachment are exported to the route reflectors with the
     * route target set to the value of the attachment's export route target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportRouteTarget")
    private final String exportRouteTarget;

    /**
     * Routes which are exported to the attachment are exported to the route reflectors with the
     * route target set to the value of the attachment's export route target.
     *
     * @return the value
     */
    public String getExportRouteTarget() {
        return exportRouteTarget;
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
        sb.append("LoopBackDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ids=").append(String.valueOf(this.ids));
        sb.append(", mplsLabel=").append(String.valueOf(this.mplsLabel));
        sb.append(", importRouteTarget=").append(String.valueOf(this.importRouteTarget));
        sb.append(", exportRouteTarget=").append(String.valueOf(this.exportRouteTarget));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoopBackDrgAttachmentNetworkDetails)) {
            return false;
        }

        LoopBackDrgAttachmentNetworkDetails other = (LoopBackDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.ids, other.ids)
                && java.util.Objects.equals(this.mplsLabel, other.mplsLabel)
                && java.util.Objects.equals(this.importRouteTarget, other.importRouteTarget)
                && java.util.Objects.equals(this.exportRouteTarget, other.exportRouteTarget)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ids == null ? 43 : this.ids.hashCode());
        result = (result * PRIME) + (this.mplsLabel == null ? 43 : this.mplsLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.importRouteTarget == null ? 43 : this.importRouteTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.exportRouteTarget == null ? 43 : this.exportRouteTarget.hashCode());
        return result;
    }
}
