package com.anmol.musicelle

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.anmol.musicelle.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), View.OnClickListener {
    lateinit var autodetect: ImageButton
    lateinit var manualselect: ImageButton
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    var navc: NavController ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navc = Navigation.findNavController(view)
        view.findViewById<ImageButton>(R.id.manualselect).setOnClickListener(this)
    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}
//override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

//    val view: View = inflater!!.inflate(R.layout.fragment_first, container, false)
//    val manualselect: ImageButton = view.find(R.id.manualselect)
//    manualselect.setOnClickListener(this)
//    return view

//    companion object {
//        fun newInstance(): fragment_first {
//            return ExampleFragment()
//        }
//    }

    override fun onClick(v: View?) {

                val intent = Intent(this@FirstFragment.context, manual_select::class.java)
                startActivity(intent)
            }


}