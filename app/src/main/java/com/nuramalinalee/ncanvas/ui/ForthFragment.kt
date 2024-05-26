package com.nuramalinalee.ncanvas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nuramalinalee.ncanvas.R
import com.nuramalinalee.ncanvas.databinding.FragmentFourBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ForthFragment : Fragment() {

    private var _binding: FragmentFourBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPrev.setOnClickListener {
            findNavController().navigate(R.id.action_FourToThird)
        }
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_FourToFirst)
        }
        binding.btnGoToPizza.setOnClickListener {
            findNavController().navigate(R.id.action_FourToPizzaSchedule)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}