/*
 * All content copyright Terracotta, Inc., unless otherwise indicated. All rights reserved.
 */
package com.tc.object.msg;

import com.tc.net.NodeID;

public interface SearchRequestMessageFactory {

  SearchQueryRequestMessage newSearchQueryRequestMessage(final NodeID nodeID);
  
  SearchResultsRequestMessage newSearchResultsRequestMessage(final NodeID nodeID);

  SearchResultsCloseMessage newSearchResultsCloseMessage(final NodeID nodeID);
}
