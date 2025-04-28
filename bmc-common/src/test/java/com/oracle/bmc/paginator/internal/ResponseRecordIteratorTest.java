/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.paginator.internal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.mockito.Mockito.when;

@PrepareForTest(ResponseRecordIteratorTest.class)
public class ResponseRecordIteratorTest {

    @Test
    public void testEmptyPages() {
        Queue<UserResponse> pages = new LinkedList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<>();
        list2.add("C");

        List<String> expectedResultList = new ArrayList<>();
        List<String> actualResultList = new ArrayList<>();
        expectedResultList.add("A");
        expectedResultList.add("B");
        expectedResultList.add("C");

        pages.offer(new UserResponse("1", list1));
        pages.offer(new UserResponse("2", new ArrayList<>()));
        pages.offer(new UserResponse("3", new ArrayList<>()));
        pages.offer(new UserResponse("4", list2));
        pages.offer(new UserResponse(null, new ArrayList<>()));

        Function<UserRequest, UserResponse> pageRetrieval = input -> pages.peek();

        Function<UserResponse, String> nextPageRetrieval = input -> pages.peek().getNextPage();

        Function<UserResponse, java.util.List<String>> retrievalItemsResponse =
                input -> pages.poll().getItems();

        Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                UserRequest.Builder>,
                        UserRequest>
                requestBuilderFunction = Mockito.mock(Function.class);

        UserRequest request = new UserRequest();
        when(requestBuilderFunction.apply(Matchers.any())).thenReturn(request);
        ResponseRecordIterator iterator =
                new ResponseRecordIterator(
                        request,
                        nextPageRetrieval,
                        requestBuilderFunction,
                        pageRetrieval,
                        retrievalItemsResponse);

        while (iterator.hasNext()) {
            Object element = iterator.next();
            actualResultList.add(String.valueOf(element));
            Assert.assertNotNull(element);
        }

        Assert.assertEquals(expectedResultList, actualResultList);
        Assert.assertNotSame(expectedResultList, actualResultList);
        Assert.assertEquals(true, pages.isEmpty());
    }

    @Test
    public void testNonEmptyPages() {
        Queue<UserResponse> pages = new LinkedList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<>();
        list2.add("C");

        List<String> expectedResultList = new ArrayList<>();
        List<String> actualResultList = new ArrayList<>();
        expectedResultList.add("A");
        expectedResultList.add("B");
        expectedResultList.add("C");

        pages.offer(new UserResponse("1", list1));
        pages.offer(new UserResponse(null, list2));

        Function<UserRequest, UserResponse> pageRetrieval = input -> pages.peek();

        Function<UserResponse, String> nextPageRetrieval = input -> pages.peek().getNextPage();

        Function<UserResponse, java.util.List<String>> retrievalItemsResponse =
                input -> pages.poll().getItems();

        Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                UserRequest.Builder>,
                        UserRequest>
                requestBuilderFunction = Mockito.mock(Function.class);

        UserRequest request = new UserRequest();
        when(requestBuilderFunction.apply(Matchers.any())).thenReturn(request);
        ResponseRecordIterator iterator =
                new ResponseRecordIterator(
                        request,
                        nextPageRetrieval,
                        requestBuilderFunction,
                        pageRetrieval,
                        retrievalItemsResponse);

        while (iterator.hasNext()) {
            Object element = iterator.next();
            actualResultList.add(String.valueOf(element));
            Assert.assertNotNull(element);
        }

        Assert.assertEquals(expectedResultList, actualResultList);
        Assert.assertNotSame(expectedResultList, actualResultList);
        Assert.assertEquals(true, pages.isEmpty());
    }

    public class UserResponse {

        public UserResponse(String nextPage, List<String> items) {
            this.nextPage = nextPage;
            this.items = items;
        }

        String nextPage;
        java.util.List<String> items;

        public String getNextPage() {
            return nextPage;
        }

        public List<String> getItems() {
            return items;
        }
    }

    public class UserRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

        public class Builder
                implements com.oracle.bmc.requests.BmcRequest.Builder<UserRequest, java.lang.Void> {

            public Builder copy(UserRequest o) {
                return this;
            }

            public UserRequest build() {
                UserRequest request = new UserRequest();
                return request;
            }
        }
    }
}
