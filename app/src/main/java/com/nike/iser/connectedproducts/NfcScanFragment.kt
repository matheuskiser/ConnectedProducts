package com.nike.iser.connectedproducts


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_nfc_scan.*


class NfcScanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_nfc_scan, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigateToFinalDestinationPageButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_nfcScanFragment_to_finalDestinationFragment)
        }

        navigateToOutsideActivityButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_nfcScanFragment_to_outsideActivity)
        }
    }
}
