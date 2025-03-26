/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The destination function for data transferred from the source. For configuration instructions,
 * see [Creating a
 * Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FunctionsTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FunctionsTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * function.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * function.
         *
         * @param functionId the value to set
         * @return this builder
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /**
         * The batch rollover size in kilobytes. Only one size option can be specified: {@code
         * batchSizeInKbs} or {@code batchSizeInNum}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
        private Integer batchSizeInKbs;

        /**
         * The batch rollover size in kilobytes. Only one size option can be specified: {@code
         * batchSizeInKbs} or {@code batchSizeInNum}.
         *
         * @param batchSizeInKbs the value to set
         * @return this builder
         */
        public Builder batchSizeInKbs(Integer batchSizeInKbs) {
            this.batchSizeInKbs = batchSizeInKbs;
            this.__explicitlySet__.add("batchSizeInKbs");
            return this;
        }
        /**
         * The batch rollover size in number of messages. Only one size option can be specified:
         * {@code batchSizeInKbs} or {@code batchSizeInNum}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInNum")
        private Integer batchSizeInNum;

        /**
         * The batch rollover size in number of messages. Only one size option can be specified:
         * {@code batchSizeInKbs} or {@code batchSizeInNum}.
         *
         * @param batchSizeInNum the value to set
         * @return this builder
         */
        public Builder batchSizeInNum(Integer batchSizeInNum) {
            this.batchSizeInNum = batchSizeInNum;
            this.__explicitlySet__.add("batchSizeInNum");
            return this;
        }
        /** The batch rollover time in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
        private Integer batchTimeInSec;

        /**
         * The batch rollover time in seconds.
         *
         * @param batchTimeInSec the value to set
         * @return this builder
         */
        public Builder batchTimeInSec(Integer batchTimeInSec) {
            this.batchTimeInSec = batchTimeInSec;
            this.__explicitlySet__.add("batchTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionsTargetDetails build() {
            FunctionsTargetDetails model =
                    new FunctionsTargetDetails(
                            this.functionId,
                            this.batchSizeInKbs,
                            this.batchSizeInNum,
                            this.batchTimeInSec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionsTargetDetails model) {
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("batchSizeInKbs")) {
                this.batchSizeInKbs(model.getBatchSizeInKbs());
            }
            if (model.wasPropertyExplicitlySet("batchSizeInNum")) {
                this.batchSizeInNum(model.getBatchSizeInNum());
            }
            if (model.wasPropertyExplicitlySet("batchTimeInSec")) {
                this.batchTimeInSec(model.getBatchTimeInSec());
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
    public FunctionsTargetDetails(
            String functionId,
            Integer batchSizeInKbs,
            Integer batchSizeInNum,
            Integer batchTimeInSec) {
        super();
        this.functionId = functionId;
        this.batchSizeInKbs = batchSizeInKbs;
        this.batchSizeInNum = batchSizeInNum;
        this.batchTimeInSec = batchTimeInSec;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * function.
     *
     * @return the value
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * The batch rollover size in kilobytes. Only one size option can be specified: {@code
     * batchSizeInKbs} or {@code batchSizeInNum}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInKbs")
    private final Integer batchSizeInKbs;

    /**
     * The batch rollover size in kilobytes. Only one size option can be specified: {@code
     * batchSizeInKbs} or {@code batchSizeInNum}.
     *
     * @return the value
     */
    public Integer getBatchSizeInKbs() {
        return batchSizeInKbs;
    }

    /**
     * The batch rollover size in number of messages. Only one size option can be specified: {@code
     * batchSizeInKbs} or {@code batchSizeInNum}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchSizeInNum")
    private final Integer batchSizeInNum;

    /**
     * The batch rollover size in number of messages. Only one size option can be specified: {@code
     * batchSizeInKbs} or {@code batchSizeInNum}.
     *
     * @return the value
     */
    public Integer getBatchSizeInNum() {
        return batchSizeInNum;
    }

    /** The batch rollover time in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("batchTimeInSec")
    private final Integer batchTimeInSec;

    /**
     * The batch rollover time in seconds.
     *
     * @return the value
     */
    public Integer getBatchTimeInSec() {
        return batchTimeInSec;
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
        sb.append("FunctionsTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", batchSizeInKbs=").append(String.valueOf(this.batchSizeInKbs));
        sb.append(", batchSizeInNum=").append(String.valueOf(this.batchSizeInNum));
        sb.append(", batchTimeInSec=").append(String.valueOf(this.batchTimeInSec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionsTargetDetails)) {
            return false;
        }

        FunctionsTargetDetails other = (FunctionsTargetDetails) o;
        return java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.batchSizeInKbs, other.batchSizeInKbs)
                && java.util.Objects.equals(this.batchSizeInNum, other.batchSizeInNum)
                && java.util.Objects.equals(this.batchTimeInSec, other.batchTimeInSec)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result =
                (result * PRIME)
                        + (this.batchSizeInKbs == null ? 43 : this.batchSizeInKbs.hashCode());
        result =
                (result * PRIME)
                        + (this.batchSizeInNum == null ? 43 : this.batchSizeInNum.hashCode());
        result =
                (result * PRIME)
                        + (this.batchTimeInSec == null ? 43 : this.batchTimeInSec.hashCode());
        return result;
    }
}
