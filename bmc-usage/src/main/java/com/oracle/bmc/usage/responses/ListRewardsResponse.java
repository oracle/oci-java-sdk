/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.responses;

import com.oracle.bmc.usage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListRewardsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned RewardCollection instance.
     */
    private com.oracle.bmc.usage.model.RewardCollection rewardCollection;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "rewardCollection"})
    private ListRewardsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.usage.model.RewardCollection rewardCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.rewardCollection = rewardCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListRewardsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            rewardCollection(o.getRewardCollection());

            return this;
        }

        public ListRewardsResponse build() {
            return new ListRewardsResponse(__httpStatusCode__, opcRequestId, rewardCollection);
        }
    }
}
