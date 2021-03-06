package org.dungpham.susi.ai.data.contract

import org.dungpham.susi.ai.rest.responses.susi.ListGroupsResponse
import org.dungpham.susi.ai.rest.responses.susi.ListSkillsResponse
import retrofit2.Response

/**
 *
 * Created by chiragw15 on 16/8/17.
 */
interface ISkillListingModel {
    interface onFetchGroupsFinishedListener {
        fun onGroupFetchSuccess(response: Response<ListGroupsResponse>)
        fun onGroupFetchFailure(t: Throwable)
    }

    interface onFetchSkillsFinishedListener {
        fun onSkillFetchSuccess(response: Response<ListSkillsResponse>, group: String)
        fun onSkillFetchFailure(t: Throwable)
    }

    fun fetchGroups(listener: onFetchGroupsFinishedListener)

    fun fetchSkills(group: String, listener: onFetchSkillsFinishedListener)

    fun cancelFetch()
}