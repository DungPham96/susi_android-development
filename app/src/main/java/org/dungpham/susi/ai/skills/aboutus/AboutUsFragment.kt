package org.dungpham.susi.ai.skills.aboutus


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about_us.*
import org.dungpham.susi.ai.R
import org.dungpham.susi.ai.skills.SkillsActivity


class AboutUsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        (activity as SkillsActivity).title = (activity as SkillsActivity).getString(R.string.action_about_us)
        var rootView = inflater!!.inflate(R.layout.fragment_about_us, container, false)
        setHasOptionsMenu(true)
        return rootView
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        val itemAbout = menu.findItem(R.id.menu_about)
        itemAbout.isVisible = false
        val itemSettings = menu.findItem(R.id.menu_settings)
        itemSettings.isVisible= true;
        super.onPrepareOptionsMenu(menu)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        about_susi.movementMethod = LinkMovementMethod.getInstance()
        contributors_desc.movementMethod = LinkMovementMethod.getInstance()
        susi_skill_cms_desc.movementMethod = LinkMovementMethod.getInstance()
        susi_report_issues_desc.movementMethod = LinkMovementMethod.getInstance()
        susi_license_info_desc.movementMethod = LinkMovementMethod.getInstance()
        super.onViewCreated(view, savedInstanceState)
    }

}
